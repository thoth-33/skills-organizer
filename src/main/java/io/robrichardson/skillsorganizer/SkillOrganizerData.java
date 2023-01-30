package io.robrichardson.skillsorganizer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;

@Getter
@AllArgsConstructor
public enum SkillOrganizerData {
    ATTACK(Skill.ATTACK, SkillsOrganizerConfig.SkillPositionOption.ONE, "attackPosition", "attackVisibility"),
    STRENGTH(Skill.STRENGTH, SkillsOrganizerConfig.SkillPositionOption.TWO, "strengthPosition", "strengthVisibility"),
    DEFENCE(Skill.DEFENCE, SkillsOrganizerConfig.SkillPositionOption.THREE, "defencePosition", "defenceVisibility"),
    RANGED(Skill.RANGED, SkillsOrganizerConfig.SkillPositionOption.FOUR, "rangedPosition", "rangedVisibility"),
    PRAYER(Skill.PRAYER, SkillsOrganizerConfig.SkillPositionOption.FIVE, "prayerPosition", "prayerVisibility"),
    MAGIC(Skill.MAGIC, SkillsOrganizerConfig.SkillPositionOption.SIX, "magicPosition", "magicVisibility"),
    RUNECRAFT(Skill.RUNECRAFT, SkillsOrganizerConfig.SkillPositionOption.SEVEN, "runecraftPosition", "runecraftVisibility"),
    CONSTRUCTION(Skill.CONSTRUCTION, SkillsOrganizerConfig.SkillPositionOption.EIGHT, "constructionPosition", "constructionVisibility"),
    HITPOINTS(Skill.HITPOINTS, SkillsOrganizerConfig.SkillPositionOption.NINE, "hitpointsPosition", "hitpointsVisibility"),
    AGILITY(Skill.AGILITY, SkillsOrganizerConfig.SkillPositionOption.TEN, "agilityPosition", "agilityVisibility"),
    HERBLORE(Skill.HERBLORE, SkillsOrganizerConfig.SkillPositionOption.ELEVEN, "herblorePosition", "herbloreVisibility"),
    THIEVING(Skill.THIEVING, SkillsOrganizerConfig.SkillPositionOption.TWELVE, "thievingPosition", "thievingVisibility"),
    CRAFTING(Skill.CRAFTING, SkillsOrganizerConfig.SkillPositionOption.THIRTEEN, "craftingPosition", "craftingVisibility"),
    FLETCHING(Skill.FLETCHING, SkillsOrganizerConfig.SkillPositionOption.FOURTEEN, "fletchingPosition", "fletchingVisibility"),
    SLAYER(Skill.SLAYER, SkillsOrganizerConfig.SkillPositionOption.FIFTEEN, "slayerPosition", "slayerVisibility"),
    HUNTER(Skill.HUNTER, SkillsOrganizerConfig.SkillPositionOption.SIXTEEN, "hunterPosition", "hunterVisibility"),
    MINING(Skill.MINING, SkillsOrganizerConfig.SkillPositionOption.SEVENTEEN, "miningPosition", "miningVisibility"),
    SMITHING(Skill.RANGED, SkillsOrganizerConfig.SkillPositionOption.EIGHTEEN, "smithingPosition", "smithingVisibility"),
    FISHING(Skill.FISHING, SkillsOrganizerConfig.SkillPositionOption.NINETEEN, "fishingPosition", "fishingVisibility"),
    COOKING(Skill.COOKING, SkillsOrganizerConfig.SkillPositionOption.TWENTY, "cookingPosition", "cookingVisibility"),
    FIREMAKING(Skill.FIREMAKING, SkillsOrganizerConfig.SkillPositionOption.TWENTY_ONE, "firemakingPosition", "firemakingVisibility"),
    WOODCUTTING(Skill.WOODCUTTING, SkillsOrganizerConfig.SkillPositionOption.TWENTY_TWO, "woodcuttingPosition", "woodcuttingVisibility"),
    FARMING(Skill.FARMING, SkillsOrganizerConfig.SkillPositionOption.TWENTY_THREE, "farmingPosition", "farmingVisibility"),
    OVERALL(Skill.OVERALL, SkillsOrganizerConfig.SkillPositionOption.TWENTY_FOUR, "overallPosition", "overallVisibility"),
    ;

    private final Skill skill;
    private final SkillsOrganizerConfig.SkillPositionOption defaultPosition;
    private final String configPositionMethodName;
    private final String configVisibilityMethodName;

    static SkillOrganizerData get(int idx) {
        if (idx < 0 || idx >= values().length) {
            return null;
        }
        return values()[idx];
    }
}
