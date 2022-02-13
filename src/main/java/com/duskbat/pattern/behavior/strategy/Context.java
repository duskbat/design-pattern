package com.duskbat.pattern.behavior.strategy;

public class Context {

    void executeStrategy(Strategy strategy) {
        strategy.doAction();
    }
}
