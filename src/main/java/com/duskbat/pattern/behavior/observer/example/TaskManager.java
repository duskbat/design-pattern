package com.duskbat.pattern.behavior.observer.example;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TaskManager implements TaskStatusChangedObserver {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void actionTaskStatusChange(Object param) throws RuntimeException {
        System.out.println("do some transaction");
    }

}
