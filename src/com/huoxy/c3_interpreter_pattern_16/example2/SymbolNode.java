package com.huoxy.c3_interpreter_pattern_16.example2;

public abstract class SymbolNode implements Node {

    protected Node left, right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
