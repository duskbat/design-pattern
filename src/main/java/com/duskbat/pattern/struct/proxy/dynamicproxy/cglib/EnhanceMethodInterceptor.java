package com.duskbat.pattern.struct.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class EnhanceMethodInterceptor implements MethodInterceptor {

    /**
     * @param o           代理对象
     * @param method      被拦截的方法（需要增强的方法）
     * @param args        方法入参
     * @param methodProxy 用于调用原始方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass());
        System.out.println("before");
        Object res = methodProxy.invokeSuper(o, args);
        System.out.println("after");
        return res;
    }

}
