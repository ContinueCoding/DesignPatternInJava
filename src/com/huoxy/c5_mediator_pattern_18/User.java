package com.huoxy.c5_mediator_pattern_18;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     * @param message msg
     */
    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
