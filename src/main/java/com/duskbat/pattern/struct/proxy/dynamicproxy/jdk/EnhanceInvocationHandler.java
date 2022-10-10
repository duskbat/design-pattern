package com.duskbat.pattern.struct.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EnhanceInvocationHandler implements InvocationHandler {

    private final TargetJDK target;

    public EnhanceInvocationHandler(TargetJDK target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        System.out.println("before");
        Object res = method.invoke(target, args);
        System.out.println("after");
        return res;
    }

}