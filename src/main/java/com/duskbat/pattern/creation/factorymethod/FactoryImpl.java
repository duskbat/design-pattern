package com.duskbat.pattern.creation.factorymethod;

public class FactoryImpl implements Factory {

    @Override
    public Product produce(String productName) {
        if ("A".equalsIgnoreCase(productName)) return new ProductA();
        return new Product() {
        };
    }
}
