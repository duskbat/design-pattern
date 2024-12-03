package com.duskbat.pattern.behavior.chain.responsibility;

/**
 * 责任链
 */
public class User {

    public void func() {
        Chain chain = new Chain();
        chain.addHandler(new Handler1());
        chain.addHandler(new Handler2());
        chain.addHandler(new Handler3());
        chain.process();
    }

    public static void main(String[] args) {
        new User().func();
    }
}
