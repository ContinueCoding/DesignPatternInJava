package com.huoxy.c12_visitor_pattern_25;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
