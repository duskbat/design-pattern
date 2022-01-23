package com.muweiye.pattern.behavior.observer;

public class User {

    public void func() {
        Observer observer = new Observer();
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.change();
    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }
}
