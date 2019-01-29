package com.huoxy.c2_command_pattern_15;

//请求类
public class Stock {

    private String name = "APPLE";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [name:" + name + ", quantity:" + quantity + "] bought!");
    }

    public void sell() {
        System.out.println("Stock [name:" + name + ", quantity:" + quantity + "] sold!");
    }
}
