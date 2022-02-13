package com.duskbat.pattern.creation.builder;

import com.duskbat.pattern.creation.builder.product.Product;

@FunctionalInterface
public interface Builder {

    Product build(Product o);

}
