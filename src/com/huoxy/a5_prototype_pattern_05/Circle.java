package com.huoxy.a5_prototype_pattern_05;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle - draw()");
    }
}
