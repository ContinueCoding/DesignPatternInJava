package com.huoxy.a4_builder_pattern_04;

//鸡肉汉堡
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
