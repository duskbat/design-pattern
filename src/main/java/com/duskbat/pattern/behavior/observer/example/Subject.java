package com.duskbat.pattern.behavior.observer.example;

import java.util.List;

/**
 * 主题抽象类
 *
 * @author muweiye
 */
public abstract class Subject<T, P> {

    /**
     * 观察者
     */
    protected final List<T> observers;

    protected Subject(List<T> observers) {
        this.observers = observers;
    }

    /**
     * 变更
     */
    abstract protected void change(P param) throws RuntimeException;

}
