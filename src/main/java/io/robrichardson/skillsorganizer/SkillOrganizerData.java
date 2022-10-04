package io.robrichardson.skillsorganizer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;
import java.util.function.Function;

@Getter
@AllArgsConstructor
public enum SkillOrganizerData {
    ATTACK(Skill.ATTACK, SkillsOrganizerConfig.SkillOption.ONE, SkillsOrganizerConfig::attack),
    STRENGTH(Skill.STRENGTH, SkillsOrganizerConfig.SkillOption.TWO, SkillsOrganizerConfig::strength),
    DEFENCE(Skill.DEFENCE, SkillsOrganizerConfig.SkillOption.THREE, SkillsOrganizerConfig::defence),
    RANGED(Skill.RANGED, SkillsOrganizerConfig.SkillOption.FOUR, SkillsOrganizerConfig::ranged),
    PRAYER(Skill.PRAYER, SkillsOrganizerConfig.SkillOption.FIVE, SkillsOrganizerConfig::prayer),
    MAGIC(Skill.MAGIC, SkillsOrganizerConfig.SkillOption.SIX, SkillsOrganizerConfig::magic),
    RUNECRAFT(Skill.RUNECRAFT, SkillsOrganizerConfig.SkillOption.SEVEN, SkillsOrganizerConfig::runecraft),
    CONSTRUCTION(Skill.CONSTRUCTION, SkillsOrganizerConfig.SkillOption.EIGHT, SkillsOrganizerConfig::construction),
    HITPOINTS(Skill.HITPOINTS, SkillsOrganizerConfig.SkillOption.NINE, SkillsOrganizerConfig::hitpoints),
    AGILITY(Skill.AGILITY, SkillsOrganizerConfig.SkillOption.TEN, SkillsOrganizerConfig::agility),
    HERBLORE(Skill.HERBLORE, SkillsOrganizerConfig.SkillOption.ELEVEN, SkillsOrganizerConfig::herblore),
    THIEVING(Skill.THIEVING, SkillsOrganizerConfig.SkillOption.TWELVE, SkillsOrganizerConfig::thieving),
    CRAFTING(Skill.CRAFTING, SkillsOrganizerConfig.SkillOption.THIRTEEN, SkillsOrganizerConfig::crafting),
    FLETCHING(Skill.FLETCHING, SkillsOrganizerConfig.SkillOption.FOURTEEN, SkillsOrganizerConfig::fletching),
    SLAYER(Skill.SLAYER, SkillsOrganizerConfig.SkillOption.FIFTEEN, SkillsOrganizerConfig::slayer),
    HUNTER(Skill.HUNTER, SkillsOrganizerConfig.SkillOption.SIXTEEN, SkillsOrganizerConfig::hunter),
    MINING(Skill.MINING, SkillsOrganizerConfig.SkillOption.SEVENTEEN, SkillsOrganizerConfig::mining),
    SMITHING(Skill.RANGED, SkillsOrganizerConfig.SkillOption.EIGHTEEN, SkillsOrganizerConfig::smithing),
    FISHING(Skill.FISHING, SkillsOrganizerConfig.SkillOption.NINETEEN, SkillsOrganizerConfig::fishing),
    COOKING(Skill.COOKING, SkillsOrganizerConfig.SkillOption.TWENTY, SkillsOrganizerConfig::cooking),
    FIREMAKING(Skill.FIREMAKING, SkillsOrganizerConfig.SkillOption.TWENTY_ONE, SkillsOrganizerConfig::firemaking),
    WOODCUTTING(Skill.WOODCUTTING, SkillsOrganizerConfig.SkillOption.TWENTY_TWO, SkillsOrganizerConfig::woodcutting),
    FARMING(Skill.FARMING, SkillsOrganizerConfig.SkillOption.TWENTY_THREE, SkillsOrganizerConfig::farming),
    OVERALL(Skill.OVERALL, SkillsOrganizerConfig.SkillOption.TWENTY_FOUR, SkillsOrganizerConfig::overall),
    ;

    private final Skill skill;
    private final SkillsOrganizerConfig.SkillOption defaultPosition;
    private final Function<SkillsOrganizerConfig, SkillsOrganizerConfig.SkillOption> skillConfig;

    static SkillOrganizerData get(int idx) {
        if (idx < 0 || idx >= values().length) {
            return null;
        }
        return values()[idx];
    }
}
