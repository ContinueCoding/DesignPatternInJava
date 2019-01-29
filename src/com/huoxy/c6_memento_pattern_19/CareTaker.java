package com.huoxy.c6_memento_pattern_19;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento state) {
        mementos.add(state);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
