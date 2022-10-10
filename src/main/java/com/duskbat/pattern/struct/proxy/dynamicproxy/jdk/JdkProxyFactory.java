package com.duskbat.pattern.struct.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getInstance(TargetJDK target) {
        Class<? extends TargetJDK> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new EnhanceInvocationHandler(target));
    }
}
