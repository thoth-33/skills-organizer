package io.robrichardson.skillsorganizer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;

@Getter
@AllArgsConstructor
public enum SkillOrganizerData {
    ATTACK(Skill.ATTACK, SkillsOrganizerConfig.SkillOption.ONE, "attack"),
    STRENGTH(Skill.STRENGTH, SkillsOrganizerConfig.SkillOption.TWO, "strength"),
    DEFENCE(Skill.DEFENCE, SkillsOrganizerConfig.SkillOption.THREE, "defence"),
    RANGED(Skill.RANGED, SkillsOrganizerConfig.SkillOption.FOUR, "ranged"),
    PRAYER(Skill.PRAYER, SkillsOrganizerConfig.SkillOption.FIVE, "prayer"),
    MAGIC(Skill.MAGIC, SkillsOrganizerConfig.SkillOption.SIX, "magic"),
    RUNECRAFT(Skill.RUNECRAFT, SkillsOrganizerConfig.SkillOption.SEVEN, "runecraft"),
    CONSTRUCTION(Skill.CONSTRUCTION, SkillsOrganizerConfig.SkillOption.EIGHT, "construction"),
    HITPOINTS(Skill.HITPOINTS, SkillsOrganizerConfig.SkillOption.NINE, "hitpoints"),
    AGILITY(Skill.AGILITY, SkillsOrganizerConfig.SkillOption.TEN, "agility"),
    HERBLORE(Skill.HERBLORE, SkillsOrganizerConfig.SkillOption.ELEVEN, "herblore"),
    THIEVING(Skill.THIEVING, SkillsOrganizerConfig.SkillOption.TWELVE, "thieving"),
    CRAFTING(Skill.CRAFTING, SkillsOrganizerConfig.SkillOption.THIRTEEN, "crafting"),
    FLETCHING(Skill.FLETCHING, SkillsOrganizerConfig.SkillOption.FOURTEEN, "fletching"),
    SLAYER(Skill.SLAYER, SkillsOrganizerConfig.SkillOption.FIFTEEN, "slayer"),
    HUNTER(Skill.HUNTER, SkillsOrganizerConfig.SkillOption.SIXTEEN, "hunter"),
    MINING(Skill.MINING, SkillsOrganizerConfig.SkillOption.SEVENTEEN, "mining"),
    SMITHING(Skill.RANGED, SkillsOrganizerConfig.SkillOption.EIGHTEEN, "smithing"),
    FISHING(Skill.FISHING, SkillsOrganizerConfig.SkillOption.NINETEEN, "fishing"),
    COOKING(Skill.COOKING, SkillsOrganizerConfig.SkillOption.TWENTY, "cooking"),
    FIREMAKING(Skill.FIREMAKING, SkillsOrganizerConfig.SkillOption.TWENTY_ONE, "firemaking"),
    WOODCUTTING(Skill.WOODCUTTING, SkillsOrganizerConfig.SkillOption.TWENTY_TWO, "woodcutting"),
    FARMING(Skill.FARMING, SkillsOrganizerConfig.SkillOption.TWENTY_THREE, "farming"),
    OVERALL(Skill.OVERALL, SkillsOrganizerConfig.SkillOption.TWENTY_FOUR, "overall"),
    ;

    private final Skill skill;
    private final SkillsOrganizerConfig.SkillOption defaultPosition;
    private final String configMethodName;

    static SkillOrganizerData get(int idx) {
        if (idx < 0 || idx >= values().length) {
            return null;
        }
        return values()[idx];
    }
}
