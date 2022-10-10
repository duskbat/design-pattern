package com.duskbat.pattern.struct.proxy.dynamicproxy.jdk;

public class TargetJDK implements BInterface {
    @Override
    public void action() {
        System.out.println("do action");
    }
}
