package com.huoxy.a4_builder_pattern_04;

//百事可乐
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi Cola";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
