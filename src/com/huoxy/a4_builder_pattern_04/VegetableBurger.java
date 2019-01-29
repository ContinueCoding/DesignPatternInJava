package com.huoxy.a4_builder_pattern_04;

//蔬菜汉堡
public class VegetableBurger extends Burger {
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
