package com.duskbat.pattern.creation.factorymethod;

public class StaticFactory {

    public static Product produce(String productName) {
        if ("A".equalsIgnoreCase(productName)) return new ProductA();
        return new Product() {
        };
    }

}
