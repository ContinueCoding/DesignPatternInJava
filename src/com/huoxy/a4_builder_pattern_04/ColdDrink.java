package com.huoxy.a4_builder_pattern_04;

//冷饮抽象类 - 用瓶子装
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
