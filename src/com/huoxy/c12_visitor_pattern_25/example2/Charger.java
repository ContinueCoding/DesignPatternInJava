package com.huoxy.c12_visitor_pattern_25.example2;

public class Charger extends Visitor {

    public Charger(String name) {
        super(name);
    }

    @Override
    public void visit(MedicineA a) {
        System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    @Override
    public void visit(MedicineB b) {
        System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
