package com.huoxy.a5_prototype_pattern_05;

//
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle - draw()");
    }
}
