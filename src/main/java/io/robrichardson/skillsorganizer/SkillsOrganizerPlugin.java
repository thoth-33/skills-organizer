package io.robrichardson.skillsorganizer;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
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
		name = "Skills Organizer"
)
public class SkillsOrganizerPlugin extends Plugin
{
	private static final int SCRIPTID_STATS_SKILLTOTAL = 396;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private SkillsOrganizerConfig config;

	@Override
	protected void startUp() throws Exception
	{
		if (client.getGameState() == GameState.LOGGED_IN) {
			clientThread.invoke(this::setupSkillBars);
		}
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientThread.invoke(this::resetSkillBars);
	}

	@Provides
	SkillsOrganizerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SkillsOrganizerConfig.class);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event) {
		if (!SkillsOrganizerConfig.GROUP.equals(event.getGroup())) return;

		clientThread.invoke(this::setupSkillBars);
	}

	@Subscribe
	public void onScriptPostFired(ScriptPostFired event) {
		if (event.getScriptId() == SCRIPTID_STATS_SKILLTOTAL) {
			setupSkillBars();
		}
	}

	private void setupSkillBars() {
		Widget skillsContainer = client.getWidget(WidgetInfo.SKILLS_CONTAINER);
		if (skillsContainer == null) {
			return;
		}

		for (Widget skillTile : skillsContainer.getStaticChildren()) {
			int idx = WidgetInfo.TO_CHILD(skillTile.getId()) - 1;
			SkillOrganizerData skillOrganizerData = SkillOrganizerData.get(idx);
			if(skillOrganizerData == null) continue;

			SkillsOrganizerConfig.SkillOption skillConfig = skillOrganizerData.getSkillConfig().apply(config);

			if(skillConfig == SkillsOrganizerConfig.SkillOption.HIDDEN) {
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

	private void resetSkillBars() {
		Widget skillsContainer = client.getWidget(WidgetInfo.SKILLS_CONTAINER);
		if (skillsContainer == null) {
			return;
		}

		for (Widget skillTile : skillsContainer.getStaticChildren()) {
			int idx = WidgetInfo.TO_CHILD(skillTile.getId()) - 1;
			SkillOrganizerData skillOrganizerData = SkillOrganizerData.get(idx);
			if(skillOrganizerData == null) continue;

			skillTile.setOriginalX(skillOrganizerData.getDefaultPosition().getX());
			skillTile.setXPositionMode(0);

			skillTile.setOriginalY(skillOrganizerData.getDefaultPosition().getY());
			skillTile.setYPositionMode(0);

			skillTile.revalidate();
			skillTile.setHidden(false);
		}
	}
}
