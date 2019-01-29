package com.huoxy.a2_abstract_factory_pattern_02;

import com.huoxy.a1_factory_pattern_01.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
