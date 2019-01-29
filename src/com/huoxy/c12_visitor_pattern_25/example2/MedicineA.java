package com.huoxy.c12_visitor_pattern_25.example2;

public class MedicineA extends Medicine {

    public MedicineA(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
