package com.muweiye.pattern.behavior.state;

public class StateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("B状态转移为A状态");
        context.setState(new StateA());
    }
}
