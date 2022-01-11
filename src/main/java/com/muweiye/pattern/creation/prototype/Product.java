package com.muweiye.pattern.creation.prototype;

public class Product implements Cloneable {

    int prop1;
    String prop2;
    StringBuilder prop3;

    public Product(int prop1, String prop2, StringBuilder prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    @Override
    public Product clone() {
        try {
            Product clone = (Product) super.clone();
            // 复制此处的可变属性，这样此克隆就不能更改原型的内部
            clone.prop3 = new StringBuilder("my prop3");
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
