package com.huoxy.c8_state_pattern_21;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state!";
    }
}
