package com.muweiye.pattern.creation.absfactory.factory;

import com.muweiye.pattern.creation.absfactory.product.Product;
import com.muweiye.pattern.creation.absfactory.product.ProductB;

public class FactoryBImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductB();
    }

}
