package com.duskbat.pattern.behavior.strategy;

/**
 * 策略模式
 *
 */
public class User {

    public void func() {
        Context context = new Context();
        Strategy strategyA = new StrategyA();
        context.executeStrategy(strategyA);
    }
}
