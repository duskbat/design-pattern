package com.duskbat.pattern.creation.absfactory.factory;

import com.duskbat.pattern.creation.absfactory.product.Product;
import com.duskbat.pattern.creation.absfactory.product.ProductA;

public class FactoryAImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductA();
    }
}
