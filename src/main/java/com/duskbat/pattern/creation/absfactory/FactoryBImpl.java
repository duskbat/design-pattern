package com.duskbat.pattern.creation.absfactory;

public class FactoryBImpl implements Factory {

    @Override
    public Product produce() {
        return new ProductB();
    }

}
