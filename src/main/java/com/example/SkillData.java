package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;

@Getter
@AllArgsConstructor
public enum SkillData {
    ATTACK(Skill.ATTACK, ExampleConfig.SkillOption.ONE, "attack"),
    STRENGTH(Skill.STRENGTH, ExampleConfig.SkillOption.TWO, "strength"),
    DEFENCE(Skill.DEFENCE, ExampleConfig.SkillOption.THREE, "defence"),
    RANGED(Skill.RANGED, ExampleConfig.SkillOption.FOUR, "ranged"),
    PRAYER(Skill.PRAYER, ExampleConfig.SkillOption.FIVE, "prayer"),
    MAGIC(Skill.MAGIC, ExampleConfig.SkillOption.SIX, "magic"),
    RUNECRAFT(Skill.RUNECRAFT, ExampleConfig.SkillOption.SEVEN, "runecraft"),
    CONSTRUCTION(Skill.CONSTRUCTION, ExampleConfig.SkillOption.EIGHT, "construction"),
    HITPOINTS(Skill.HITPOINTS, ExampleConfig.SkillOption.NINE, "hitpoints"),
    AGILITY(Skill.AGILITY, ExampleConfig.SkillOption.TEN, "agility"),
    HERBLORE(Skill.HERBLORE, ExampleConfig.SkillOption.ELEVEN, "herblore"),
    THIEVING(Skill.THIEVING, ExampleConfig.SkillOption.TWELVE, "thieving"),
    CRAFTING(Skill.CRAFTING, ExampleConfig.SkillOption.THIRTEEN, "crafting"),
    FLETCHING(Skill.FLETCHING, ExampleConfig.SkillOption.FOURTEEN, "fletching"),
    SLAYER(Skill.SLAYER, ExampleConfig.SkillOption.FIFTEEN, "slayer"),
    HUNTER(Skill.HUNTER, ExampleConfig.SkillOption.SIXTEEN, "hunter"),
    MINING(Skill.MINING, ExampleConfig.SkillOption.SEVENTEEN, "mining"),
    SMITHING(Skill.RANGED, ExampleConfig.SkillOption.EIGHTEEN, "smithing"),
    FISHING(Skill.FISHING, ExampleConfig.SkillOption.NINETEEN, "fishing"),
    COOKING(Skill.COOKING, ExampleConfig.SkillOption.TWENTY, "cooking"),
    FIREMAKING(Skill.FIREMAKING, ExampleConfig.SkillOption.TWENTY_ONE, "firemaking"),
    WOODCUTTING(Skill.WOODCUTTING, ExampleConfig.SkillOption.TWENTY_TWO, "woodcutting"),
    FARMING(Skill.FARMING, ExampleConfig.SkillOption.TWENTY_THREE, "farming"),
    OVERALL(Skill.OVERALL, ExampleConfig.SkillOption.TWENTY_FOUR, "overall"),
    ;

    private final Skill skill;
    private final ExampleConfig.SkillOption defaultPosition;
    private final String configMethodName;

    static SkillData get(int idx) {
        if (idx < 0 || idx >= values().length) {
            return null;
        }
        return values()[idx];
    }
}
