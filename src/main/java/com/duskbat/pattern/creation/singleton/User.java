package com.duskbat.pattern.creation.singleton;

/**
 * 4种单例模式
 */
public class User {

    public void func() {
        Singleton0 instance0 = Singleton0.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton3 instance3 = Singleton3.getInstance();
    }
}
