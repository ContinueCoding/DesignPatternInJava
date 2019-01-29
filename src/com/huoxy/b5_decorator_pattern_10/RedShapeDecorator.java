package com.huoxy.b5_decorator_pattern_10;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        //super.draw();
        decoratedShape.draw();

        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Add Red Border!");
    }
}
