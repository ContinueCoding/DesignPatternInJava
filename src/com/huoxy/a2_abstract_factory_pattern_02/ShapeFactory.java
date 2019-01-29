package com.huoxy.a2_abstract_factory_pattern_02;

import com.huoxy.a1_factory_pattern_01.Circle;
import com.huoxy.a1_factory_pattern_01.Rectangle;
import com.huoxy.a1_factory_pattern_01.Shape;
import com.huoxy.a1_factory_pattern_01.Square;
import com.huoxy.utils.Utils;

public class ShapeFactory extends AbstractFactory {

    public static final String SHAPE_CIRCLE = "circle";
    public static final String SHAPE_RECTANGLE = "rectangle";
    public static final String SHAPE_SQUARE = "square";

    @Override
    public Shape getShape(String shape) {
        if(Utils.isEmpty(shape)) {
            return null;
        }

        switch (shape) {
            case SHAPE_CIRCLE:
                return new Circle();
            case SHAPE_RECTANGLE:
                return new Rectangle();
            case SHAPE_SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Unsupported shape : " + shape);
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
