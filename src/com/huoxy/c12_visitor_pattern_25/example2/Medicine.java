package com.huoxy.c12_visitor_pattern_25.example2;

import java.util.Objects;

public abstract class Medicine {
    protected String name;
    protected double price;

    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //在被访问的类里面加一个对外提供接待访问者的接口 - 在数据基础类里面有一个方法接受访问者，将自身引用传入访问者(具体实现类)。
    public abstract void accept(Visitor visitor);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicine)) return false;
        Medicine medicine = (Medicine) o;
        return Double.compare(medicine.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), medicine.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getPrice());
    }
}
