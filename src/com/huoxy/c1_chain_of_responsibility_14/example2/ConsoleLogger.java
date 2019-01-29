package com.huoxy.c1_chain_of_responsibility_14.example2;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String log) {
        System.out.println("ConsoleLogger write log: " + log);
    }
}
