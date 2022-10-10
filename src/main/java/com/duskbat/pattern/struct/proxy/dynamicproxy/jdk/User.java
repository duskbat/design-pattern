package com.duskbat.pattern.struct.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 通过 {@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)} 生成代理对象<br/>
 * 创建 {@link InvocationHandler} 持有被代理对象, 调用 {@link InvocationHandler#invoke(Object, Method, Object[])} 的时候调用原始方法<br/>
 * 与 CGLib 不同, JDK动态代理最好将被代理对象的引用传入, 因为CGLib生成子类, 可以调用super; JDK动态代理需要持有被代理对象
 */
public class User {

    public void func() {
        TargetJDK target = new TargetJDK();
        BInterface proxy = (BInterface) JdkProxyFactory.getInstance(target);
        proxy.action();
    }


    public static void main(String[] args) {
        User user = new User();
        user.func();
    }
}
