package com.duskbat.pattern.creation.builder;

/**
 * 建造者模式<br>
 * 使用方关注建造顺序和过程
 * 不关注建造细节
 */
public class User {
    Builder stepA = new BuilderStepA();
    Builder stepB = new BuilderStepB();

    public void func() {
        Product product = new Product();
        product.builder(stepA)
                .builder(stepB);
    }

}
