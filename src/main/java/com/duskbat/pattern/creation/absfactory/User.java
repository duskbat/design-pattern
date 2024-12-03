package com.duskbat.pattern.creation.absfactory;

/**
 * 抽象工厂模式<br>
 * 使用方控制创建想要的工厂,然后生产产品.<br>
 * 不关注工厂和产品的生产过程
 */
public class User {

    Product productA;
    Product productB;


    public void func1() {
        productA = new FactoryAImpl().produce();
        productB = new FactoryBImpl().produce();
    }

}
