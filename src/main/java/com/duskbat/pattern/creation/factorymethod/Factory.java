package com.duskbat.pattern.creation.factorymethod;

public interface Factory {

    FactoryImpl IMPL = new FactoryImpl();

    static Factory getFactory() {
        return IMPL;
    }

    Product produce(String productName);

}
