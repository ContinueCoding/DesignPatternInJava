package com.huoxy.c5_mediator_pattern_18.example2;

public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //通过中介者发送消息
    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房东: " + name +",获得信息：" + message);
    }
}
