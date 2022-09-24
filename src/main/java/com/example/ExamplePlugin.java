package com.example;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.callback.ClientThread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
@PluginDescriptor(
		name = "Example"
)
public class ExamplePlugin extends Plugin
{
	private static final int SCRIPTID_STATS_SKILLTOTAL = 396;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ExampleConfig config;

	@Override
	protected void startUp() throws Exception
	{
		if (client.getGameState() == GameState.LOGGED_IN) {
			clientThread.invoke(this::buildSkillBars);
		}
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientThread.invoke(this::removeSkillBars);
	}

	@Provides
	ExampleConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ExampleConfig.class);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event) {
		if (!ExampleConfig.GROUP.equals(event.getGroup())) return;

		clientThread.invoke(this::buildSkillBars);
	}

	@Subscribe
	public void onScriptPostFired(ScriptPostFired event) {
		if (event.getScriptId() == SCRIPTID_STATS_SKILLTOTAL) {
			buildSkillBars();
		}
	}

	private void buildSkillBars() {
		Widget skillsContainer = client.getWidget(WidgetInfo.SKILLS_CONTAINER);
		if (skillsContainer == null) {
			return;
		}

		for (Widget skillTile : skillsContainer.getStaticChildren()) {
			int idx = WidgetInfo.TO_CHILD(skillTile.getId()) - 1;
			SkillData skillData = SkillData.get(idx);
			if(skillData == null) continue;

			ExampleConfig.SkillOption skillConfig = getSkillConfig(skillData);

			if(skillConfig == ExampleConfig.SkillOption.HIDDEN) {
				skillTile.setHidden(true);
			} else {
				skillTile.setOriginalX(skillConfig.getX());
				skillTile.setXPositionMode(0);

				skillTile.setOriginalY(skillConfig.getY());
				skillTile.setYPositionMode(0);

				skillTile.revalidate();
				skillTile.setHidden(false);
			}
		}
	}

	private void removeSkillBars() {
		Widget skillsContainer = client.getWidget(WidgetInfo.SKILLS_CONTAINER);
		if (skillsContainer == null) {
			return;
		}

		for (Widget skillTile : skillsContainer.getStaticChildren()) {
			int idx = WidgetInfo.TO_CHILD(skillTile.getId()) - 1;
			SkillData skillData = SkillData.get(idx);
			if(skillData == null) continue;

			skillTile.setOriginalX(skillData.getDefaultPosition().getX());
			skillTile.setXPositionMode(0);

			skillTile.setOriginalY(skillData.getDefaultPosition().getY());
			skillTile.setYPositionMode(0);

			skillTile.revalidate();
			skillTile.setHidden(false);
		}
	}

	private ExampleConfig.SkillOption getSkillConfig(SkillData skillData) {
		String methodName = skillData.getConfigMethodName();
		try {
			Method method = ExampleConfig.class.getMethod(methodName);
			return (ExampleConfig.SkillOption) method.invoke(config);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			return ExampleConfig.SkillOption.HIDDEN;
		}
	}
}
