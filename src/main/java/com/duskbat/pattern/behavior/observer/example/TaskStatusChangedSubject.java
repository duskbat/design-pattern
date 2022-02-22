package com.duskbat.pattern.behavior.observer.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 任务单状态变更的主题
 *
 * @author muweiye
 */


@Component
public class TaskStatusChangedSubject extends Subject<TaskStatusChangedObserver, Object> {

    @Autowired
    public TaskStatusChangedSubject(List<TaskStatusChangedObserver> observers) {
        super(observers);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void change(Object param) throws RuntimeException {
        notifyAllObservers(param);
    }

    /**
     * 内部通知
     */
    private void notifyAllObservers(Object param) {
        observers.forEach(o ->
                o.actionTaskStatusChange(param)
        );
    }

}
