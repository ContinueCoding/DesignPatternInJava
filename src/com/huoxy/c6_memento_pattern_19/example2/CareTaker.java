package com.huoxy.c6_memento_pattern_19.example2;

/**
 * 负责人 - 只有CareTaker可以保存和获取备忘录对象，且不可以访问备忘录中的具体数据！
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
