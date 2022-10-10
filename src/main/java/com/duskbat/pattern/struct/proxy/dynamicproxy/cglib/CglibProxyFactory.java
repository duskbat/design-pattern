package com.duskbat.pattern.struct.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new EnhanceMethodInterceptor());
        return enhancer.create();
    }
}
