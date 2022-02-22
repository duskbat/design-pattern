package com.duskbat.pattern.behavior.observer.example;

import org.springframework.stereotype.Component;

@Component
public class TaskManager implements TaskStatusChangedObserver {

    @Override
    public void actionTaskStatusChange(Object param) throws RuntimeException {
        System.out.println("do some transaction");
    }

}
