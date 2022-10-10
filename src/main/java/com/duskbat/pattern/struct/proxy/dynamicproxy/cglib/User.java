package com.duskbat.pattern.struct.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * CGLIB 动态代理, 通过 {@link org.springframework.cglib.proxy.Enhancer} 动态生成子类<br/>
 * 通过 {@link MethodInterceptor#intercept(Object, Method, Object[], MethodProxy)} 增强行为
 */
public class User {

    public void func() {
        TargetCGLib target = (TargetCGLib) CglibProxyFactory.getProxy(TargetCGLib.class);
        target.action();
    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }
}
