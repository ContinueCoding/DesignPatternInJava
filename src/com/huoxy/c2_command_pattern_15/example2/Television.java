package com.huoxy.c2_command_pattern_15.example2;

//电视类 - 开、关、换频道
public class Television {

    public void open() {
        System.out.println("Open TV...");
    }

    public void close() {
        System.out.println("Close TV!");
    }

    public void changeChannel(int channelIndex) {
        System.out.println("Change channel... channelIndex = " + channelIndex);
    }

}
