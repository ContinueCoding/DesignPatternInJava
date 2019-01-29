package com.huoxy.c6_memento_pattern_19;

//需要保存状态的对象
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存当前状态 - save
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    //恢复之前的状态 - restore
    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
