package com.muweiye.pattern.struct.facede;

/**
 * 外观模式
 */
public class User {

    public void func() {
        new Facede().func();
    }

}
