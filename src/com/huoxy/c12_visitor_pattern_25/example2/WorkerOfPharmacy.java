package com.huoxy.c12_visitor_pattern_25.example2;

public class WorkerOfPharmacy extends Visitor {

    public WorkerOfPharmacy(String name) {
        super(name);
    }

    @Override
    public void visit(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void visit(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
