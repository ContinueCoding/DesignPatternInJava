package com.huoxy.c12_visitor_pattern_25;

public class ComputerDisplayVisitor implements ComputerVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor.");
    }
}
