package com.huoxy.c12_visitor_pattern_25.example2;

public abstract class Visitor {
    protected String name;

    public Visitor(String name) {
        this.name = name;
    }

    public abstract void visit(MedicineA a);
    public abstract void visit(MedicineB b);
}
