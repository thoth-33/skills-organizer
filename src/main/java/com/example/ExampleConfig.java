package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(ExampleConfig.GROUP)
public interface ExampleConfig extends Config
{
	String GROUP = "SkillsOrganizor";

	@ConfigItem(
		keyName = "attack",
		name = "Attack",
		description = "Set the attack skill option"
	)
	default SkillOption attack()
	{
		return SkillOption.ONE;
	}

	@ConfigItem(
			keyName = "strength",
			name = "Strength",
			description = "Set the strength skill option"
	)
	default SkillOption strength()
	{
		return SkillOption.TWO;
	}

	@ConfigItem(
			keyName = "defence",
			name = "Defence",
			description = "Set the defence skill option"
	)
	default SkillOption defence()
	{
		return SkillOption.THREE;
	}

	@ConfigItem(
			keyName = "ranged",
			name = "Ranged",
			description = "Set the ranged skill option"
	)
	default SkillOption ranged()
	{
		return SkillOption.FOUR;
	}

	@ConfigItem(
			keyName = "prayer",
			name = "Prayer",
			description = "Set the prayer skill option"
	)
	default SkillOption prayer()
	{
		return SkillOption.FIVE;
	}

	@ConfigItem(
			keyName = "magic",
			name = "Magic",
			description = "Set the magic skill option"
	)
	default SkillOption magic()
	{
		return SkillOption.SIX;
	}

	@ConfigItem(
			keyName = "runecraft",
			name = "Runecraft",
			description = "Set the runecraft skill option"
	)
	default SkillOption runecraft()
	{
		return SkillOption.SEVEN;
	}

	@ConfigItem(
			keyName = "construction",
			name = "Construction",
			description = "Set the construction skill option"
	)
	default SkillOption construction()
	{
		return SkillOption.EIGHT;
	}

	@ConfigItem(
			keyName = "hitpoints",
			name = "Hitpoints",
			description = "Set the hitpoints skill option"
	)
	default SkillOption hitpoints()
	{
		return SkillOption.NINE;
	}

	@ConfigItem(
			keyName = "agility",
			name = "Agility",
			description = "Set the agility skill option"
	)
	default SkillOption agility()
	{
		return SkillOption.TEN;
	}

	@ConfigItem(
			keyName = "herblore",
			name = "Herblore",
			description = "Set the herblore skill option"
	)
	default SkillOption herblore()
	{
		return SkillOption.ELEVEN;
	}

	@ConfigItem(
			keyName = "thieving",
			name = "thieving",
			description = "Set the thieving skill option"
	)
	default SkillOption thieving()
	{
		return SkillOption.TWELVE;
	}

	@ConfigItem(
			keyName = "crafting",
			name = "Crafting",
			description = "Set the crafting skill option"
	)
	default SkillOption crafting()
	{
		return SkillOption.THIRTEEN;
	}

	@ConfigItem(
			keyName = "fletching",
			name = "Fletching",
			description = "Set the fletching skill option"
	)
	default SkillOption fletching()
	{
		return SkillOption.FOURTEEN;
	}

	@ConfigItem(
			keyName = "slayer",
			name = "Slayer",
			description = "Set the slayer skill option"
	)
	default SkillOption slayer()
	{
		return SkillOption.FIFTEEN;
	}

	@ConfigItem(
			keyName = "hunter",
			name = "Hunter",
			description = "Set the hunter skill option"
	)
	default SkillOption hunter()
	{
		return SkillOption.SIXTEEN;
	}

	@ConfigItem(
			keyName = "mining",
			name = "Mining",
			description = "Set the mining skill option"
	)
	default SkillOption mining()
	{
		return SkillOption.SEVENTEEN;
	}

	@ConfigItem(
			keyName = "smithing",
			name = "Smithing",
			description = "Set the smithing skill option"
	)
	default SkillOption smithing()
	{
		return SkillOption.EIGHTEEN;
	}

	@ConfigItem(
			keyName = "fishing",
			name = "Fishing",
			description = "Set the fishing skill option"
	)
	default SkillOption fishing()
	{
		return SkillOption.NINETEEN;
	}

	@ConfigItem(
			keyName = "cooking",
			name = "Cooking",
			description = "Set the cooking skill option"
	)
	default SkillOption cooking()
	{
		return SkillOption.TWENTY;
	}

	@ConfigItem(
			keyName = "firemaking",
			name = "Firemaking",
			description = "Set the firemaking skill option"
	)
	default SkillOption firemaking()
	{
		return SkillOption.TWENTY_ONE;
	}

	@ConfigItem(
			keyName = "woodcutting",
			name = "Woodcutting",
			description = "Set the woodcutting skill option"
	)
	default SkillOption woodcutting()
	{
		return SkillOption.TWENTY_TWO;
	}

	@ConfigItem(
			keyName = "farming",
			name = "Farming",
			description = "Set the farming skill option"
	)
	default SkillOption farming()
	{
		return SkillOption.TWENTY_THREE;
	}

	@ConfigItem(
			keyName = "overall",
			name = "Total Level",
			description = "Set the total level option"
	)
	default SkillOption overall() {
		return SkillOption.TWENTY_FOUR;
	}

	@Getter
	@AllArgsConstructor
	enum SkillOption
	{
		HIDDEN("Hidden", 0,0),
		ONE("Position 1", 1, 1),
		TWO("Position 2", 1,32),
		THREE("Position 3", 1,65),
		FOUR("Position 4", 1,97),
		FIVE("Position 5", 1,129),
		SIX("Position 6", 1,161),
		SEVEN("Position 7", 1,193),
		EIGHT("Position 8", 1,225),
		NINE("Position 9", 64,1),
		TEN("Position 10", 64,33),
		ELEVEN("Position 11", 64,65),
		TWELVE("Position 12", 64,97),
		THIRTEEN("Position 13", 64,129),
		FOURTEEN("Position 14", 64,161),
		FIFTEEN("Position 15", 64,193),
		SIXTEEN("Position 16", 64,225),
		SEVENTEEN("Position 17", 127,1),
		EIGHTEEN("Position 18", 127,33),
		NINETEEN("Position 19", 127,65),
		TWENTY("Position 20", 127,97),
		TWENTY_ONE("Position 21", 127,129),
		TWENTY_TWO("Position 22", 127,161),
		TWENTY_THREE("Position 23", 127,193),
		TWENTY_FOUR("Position 24", 127,225),
		;

		private final String name;
		private final int x;
		private final int y;

		@Override
		public String toString()
		{
			return name;
		}
	}
}
