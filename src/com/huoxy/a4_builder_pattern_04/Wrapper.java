package com.huoxy.a4_builder_pattern_04;

//食物的包装纸
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper - 包装汉堡!";
    }
}
