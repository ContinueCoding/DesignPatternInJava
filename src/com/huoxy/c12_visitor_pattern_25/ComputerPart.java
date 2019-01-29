package com.huoxy.c12_visitor_pattern_25;

public interface ComputerPart {

    void accept(ComputerVisitor visitor);
}
