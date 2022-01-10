package com.muweiye.pattern.creation.absfactory.factory;

import com.muweiye.pattern.creation.absfactory.product.Product;
import com.muweiye.pattern.creation.absfactory.product.ProductA;

public class FactoryAImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductA();
    }
}
