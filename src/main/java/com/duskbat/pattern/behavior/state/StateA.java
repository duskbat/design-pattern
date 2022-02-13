package com.duskbat.pattern.behavior.state;

public class StateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("A状态转移为B状态");
        context.setState(new StateB());
    }

}
