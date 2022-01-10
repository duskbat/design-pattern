package com.muweiye.pattern.creation.factorymethod.factory;

import com.muweiye.pattern.creation.factorymethod.product.Product;

public interface Factory {

    FactoryImpl IMPL = new FactoryImpl();

    static Factory getFactory() {
        return IMPL;
    }

    Product produce(String productName);

}
