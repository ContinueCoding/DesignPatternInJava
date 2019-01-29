package com.huoxy.c12_visitor_pattern_25.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Prescription {
    List<Medicine> medicineList = new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        medicineList.add(medicine);
    }

    public void removeMedicine(Medicine medicine) {
        medicineList.remove(medicine);
    }

    /**
     * 接受visitor的访问（visitor遍历处理medicineList中的medicine）
     *
     * @param visitor 访问者
     */
    public void accept(Visitor visitor) {
        for (Medicine medicine : medicineList) {
            medicine.accept(visitor);
        }
    }

}
