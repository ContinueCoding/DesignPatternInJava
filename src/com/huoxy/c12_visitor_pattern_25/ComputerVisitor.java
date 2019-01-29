package com.huoxy.c12_visitor_pattern_25;

//可以有多个ComputerVisitor的实现子类 - 分别方位ComputerPart的各个部分！
public interface ComputerVisitor {

    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
