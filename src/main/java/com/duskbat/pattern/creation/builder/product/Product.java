package com.duskbat.pattern.creation.builder.product;

import com.duskbat.pattern.creation.builder.Builder;

public class Product {

    public Product builder(Builder builder) {
        return builder.build(this);
    }

}
