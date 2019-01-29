package com.huoxy.a5_prototype_pattern_05;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square - draw()");
    }
}
