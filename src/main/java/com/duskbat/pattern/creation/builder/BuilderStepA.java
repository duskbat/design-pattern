package com.duskbat.pattern.creation.builder;

import com.duskbat.pattern.creation.builder.product.Product;

public class BuilderStepA implements Builder {

    @Override
    public Product build(Product o) {
        return o;
    }
}
