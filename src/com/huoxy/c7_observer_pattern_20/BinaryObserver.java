package com.huoxy.c7_observer_pattern_20;

//具体观察者类
public class BinaryObserver extends Observer {

    //构造方法里传入Subject & 将自己添加到Subject的观察者列表里！
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
