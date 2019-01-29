package com.huoxy.c1_chain_of_responsibility_14.example2;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String log) {
        System.out.println("ErrorLogger write log: " + log);
    }
}
