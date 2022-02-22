package com.duskbat.pattern.behavior.observer.example;

/**
 * 任务单状态变更的观察者
 */
public interface TaskStatusChangedObserver {

    /**
     * 状态变更时响应的操作
     *
     * @param param 状态变更参数
     * @throws RuntimeException 业务异常
     */
    void actionTaskStatusChange(Object param) throws RuntimeException;

}
