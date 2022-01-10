package com.muweiye.pattern.creation.builder;

import com.muweiye.pattern.creation.builder.product.Product;

@FunctionalInterface
public interface Builder {

    Product build(Product o);

}
