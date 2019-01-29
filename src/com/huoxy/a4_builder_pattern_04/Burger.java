package com.huoxy.a4_builder_pattern_04;

/**
 * 汉堡抽象类 - 用包装纸装
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
