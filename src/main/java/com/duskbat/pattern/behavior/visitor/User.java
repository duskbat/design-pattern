package com.duskbat.pattern.behavior.visitor;

/**
 * 访问者是有备而来, 访问者已经定义好了它访问时要做的事情
 */
public class User {
    public void func() {
        PartA partA = new PartA();
        PartB partB = new PartB();
        Visitor visitor = new GoodVisitor();
        partA.accept(visitor);
        partB.accept(visitor);
    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }
}
