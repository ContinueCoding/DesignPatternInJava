package com.huoxy.a4_builder_pattern_04;

/**
 * 表示食物条目（比如汉堡和冷饮）的 Item 接口
 */
public interface Item {
    String name();

    float price();

    Packing packing();
}
