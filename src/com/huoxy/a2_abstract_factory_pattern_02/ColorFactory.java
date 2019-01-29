package com.huoxy.a2_abstract_factory_pattern_02;

import com.huoxy.a1_factory_pattern_01.Shape;
import com.huoxy.utils.Utils;

public class ColorFactory extends AbstractFactory {

    public static final String COLOR_RED = "red";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_BLUE = "blue";

    @Override
    public Color getColor(String color) {
        if (Utils.isEmpty(color)) {
            return null;
        }

        switch (color) {
            case COLOR_RED:
                return new Red();
            case COLOR_GREEN:
                return new Green();
            case COLOR_BLUE:
                return new Blue();
            default:
                throw new IllegalArgumentException("Unsupported color : " + color);
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
