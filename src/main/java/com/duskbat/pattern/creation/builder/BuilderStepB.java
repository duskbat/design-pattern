package com.duskbat.pattern.creation.builder;

import com.duskbat.pattern.creation.builder.product.Product;

public class BuilderStepB implements Builder {

    @Override
    public Product build(Product o) {
        return o;
    }
}
