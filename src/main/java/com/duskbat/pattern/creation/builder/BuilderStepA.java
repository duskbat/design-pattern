package com.duskbat.pattern.creation.builder;

public class BuilderStepA implements Builder {

    @Override
    public Product build(Product o) {
        return o;
    }
}
