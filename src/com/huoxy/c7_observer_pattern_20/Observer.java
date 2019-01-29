package com.huoxy.c7_observer_pattern_20;

//观察者抽象类
public abstract class Observer {

    //持有被观察者的引用！
    protected Subject subject;

    public abstract void update();

}

