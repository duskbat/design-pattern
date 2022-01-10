package com.muweiye.pattern.creation.builder;

import com.muweiye.pattern.creation.builder.product.Product;

public class BuilderStepB implements Builder {

    @Override
    public Product build(Product o) {
        return o;
    }
}
