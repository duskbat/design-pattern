package com.duskbat.pattern.creation.builder;

public class Product {

    public Product builder(Builder builder) {
        return builder.build(this);
    }

}
