package com.duskbat.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;


public class Subject {

    List<Observer> observers = new ArrayList<>();

    /**
     * 注册
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 内部通知
     */
    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.doAction();
        }
    }

    public void change() {
        notifyAllObservers();
    }

}
