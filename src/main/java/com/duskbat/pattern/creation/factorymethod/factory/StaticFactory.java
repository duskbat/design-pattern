package com.duskbat.pattern.creation.factorymethod.factory;

import com.duskbat.pattern.creation.factorymethod.product.Product;
import com.duskbat.pattern.creation.factorymethod.product.ProductA;

public class StaticFactory {

    public static Product produce(String productName) {
        if ("A".equalsIgnoreCase(productName)) return new ProductA();
        return new Product() {
        };
    }

}
