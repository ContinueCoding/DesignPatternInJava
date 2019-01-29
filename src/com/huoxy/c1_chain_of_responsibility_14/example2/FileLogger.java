package com.huoxy.c1_chain_of_responsibility_14.example2;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String log) {
        System.out.println("FileLogger write log: " + log);
    }
}
