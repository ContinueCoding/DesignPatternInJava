package com.huoxy.a4_builder_pattern_04;

//可口可乐
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke Cola";
    }

    @Override
    public float price() {
        return 6.0f;
    }
}
