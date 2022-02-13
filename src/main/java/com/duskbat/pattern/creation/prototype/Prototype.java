package com.duskbat.pattern.creation.prototype;

public class Prototype {

    private static final Product PROTOTYPE = new Product(1, "prop", new StringBuilder("default"));

    public static Product getProduct() {
        return PROTOTYPE.clone();
    }

}
