package com.huoxy.b2_bridge_pattern_07;

//TODO GreenAPI更好？ 不应该与Circle绑定？
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle: center = " + "[" + x + ", " + y + "], radius = " + radius + ", color = Green");
    }
}
