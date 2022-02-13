package com.duskbat.pattern.creation.factorymethod;

import com.duskbat.pattern.creation.factorymethod.factory.Factory;
import com.duskbat.pattern.creation.factorymethod.factory.StaticFactory;
import com.duskbat.pattern.creation.factorymethod.product.Product;

/**
 * 工厂方法模式<br>
 * 使用方给定想要的产品<br>
 * 不关注生产的过程
 */
public class User {

    Product product1;
    Product product2;


    public void func1() {
        product1 = Factory.getFactory().produce("A");
    }

    public void func2() {
        product2 = StaticFactory.produce("A");
    }

}
