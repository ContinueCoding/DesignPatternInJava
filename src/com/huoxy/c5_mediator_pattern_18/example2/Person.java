package com.huoxy.c5_mediator_pattern_18.example2;

//抽象同事对象
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void getMessage(String msg);
}
