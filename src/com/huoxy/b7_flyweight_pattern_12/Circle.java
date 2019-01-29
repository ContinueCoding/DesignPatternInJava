package com.huoxy.b7_flyweight_pattern_12;

public class Circle implements Shape {

    private String color;
    private int centerX;
    private int centerY;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle - center = "
                + "[" + centerX + ", " + centerY + "], radius = " + radius + ", color = " + color);
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                '}';
    }
}
