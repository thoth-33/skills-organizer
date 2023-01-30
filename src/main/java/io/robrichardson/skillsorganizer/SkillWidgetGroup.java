package io.robrichardson.skillsorganizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.widgets.Widget;

@Data
@AllArgsConstructor
class SkillWidgetGroup {
    private Widget left;
    private Widget right;
    private Widget darken;

    boolean contains(Widget other) {
        return other == left || other == right || other == darken;
    }
}