package com.huoxy.c3_interpreter_pattern_16.example2;

public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
