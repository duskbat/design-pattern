package com.muweiye.pattern.creation.builder.product;

import com.muweiye.pattern.creation.builder.Builder;

public class Product {

    public Product builder(Builder builder) {
        return builder.build(this);
    }

}
