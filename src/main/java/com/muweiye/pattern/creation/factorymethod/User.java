package com.muweiye.pattern.creation.factorymethod;

import com.muweiye.pattern.creation.factorymethod.factory.Factory;
import com.muweiye.pattern.creation.factorymethod.factory.StaticFactory;
import com.muweiye.pattern.creation.factorymethod.product.Product;

/**
 * 工厂方法模式<br>
 * 只关注
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
