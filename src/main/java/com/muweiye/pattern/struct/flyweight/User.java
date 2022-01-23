package com.muweiye.pattern.struct.flyweight;

/**
 * 享元模式<br>
 * 缓存
 */
public class User {

    public void func() {
        Cache.get("key");
    }
}
