package com.duskbat.pattern.creation.factorymethod.factory;

import com.duskbat.pattern.creation.factorymethod.product.Product;

public interface Factory {

    FactoryImpl IMPL = new FactoryImpl();

    static Factory getFactory() {
        return IMPL;
    }

    Product produce(String productName);

}
