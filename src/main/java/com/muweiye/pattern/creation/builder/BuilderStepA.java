package com.muweiye.pattern.creation.builder;

import com.muweiye.pattern.creation.builder.product.Product;

public class BuilderStepA implements Builder {

    @Override
    public Product build(Product o) {
        return o;
    }
}
