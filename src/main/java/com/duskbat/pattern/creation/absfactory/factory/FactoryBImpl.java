package com.duskbat.pattern.creation.absfactory.factory;

import com.duskbat.pattern.creation.absfactory.product.Product;
import com.duskbat.pattern.creation.absfactory.product.ProductB;

public class FactoryBImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductB();
    }

}
