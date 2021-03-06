package com.duskbat.pattern.behavior.state;

import lombok.Setter;

@Setter
public class Context {

    private State state;

    void doAction() {
        state.handle(this);
    }
}
