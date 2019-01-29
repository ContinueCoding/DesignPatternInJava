package com.huoxy.c12_visitor_pattern_25.example2;

public class MedicineB extends Medicine {

    public MedicineB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
