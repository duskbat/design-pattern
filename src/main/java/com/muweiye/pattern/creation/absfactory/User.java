package com.muweiye.pattern.creation.absfactory;

import com.muweiye.pattern.creation.absfactory.factory.FactoryAImpl;
import com.muweiye.pattern.creation.absfactory.factory.FactoryBImpl;
import com.muweiye.pattern.creation.absfactory.product.Product;

public class User {

    Product productA;
    Product productB;


    public void func1() {
        productA = new FactoryAImpl().produce();
        productB = new FactoryBImpl().produce();

    }

}
