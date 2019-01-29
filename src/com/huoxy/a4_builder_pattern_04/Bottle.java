package com.huoxy.a4_builder_pattern_04;

//饮料瓶
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle - 装饮料！";
    }
}
