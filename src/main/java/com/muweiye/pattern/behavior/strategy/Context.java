package com.muweiye.pattern.behavior.strategy;

public class Context {

    void executeStrategy(Strategy strategy) {
        strategy.doAction();
    }
}
