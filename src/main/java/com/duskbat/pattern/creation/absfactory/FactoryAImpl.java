package com.duskbat.pattern.creation.absfactory;

public class FactoryAImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductA();
    }
}
