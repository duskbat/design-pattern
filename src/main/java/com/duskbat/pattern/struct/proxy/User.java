package com.duskbat.pattern.struct.proxy;

/**
 * 代理模式
 */
public class User {

    public void func() {
        AInterface proxy = new Proxy<>(new Real());
        proxy.action();
    }
}
