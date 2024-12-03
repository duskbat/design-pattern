package com.duskbat.pattern.creation.builder;

@FunctionalInterface
public interface Builder {

    Product build(Product o);

}
