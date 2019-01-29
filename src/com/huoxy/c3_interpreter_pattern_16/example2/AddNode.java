package com.huoxy.c3_interpreter_pattern_16.example2;

public class AddNode extends SymbolNode {

    public AddNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
