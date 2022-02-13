package com.duskbat.pattern.behavior.visitor;

public class GoodVisitor implements Visitor {
    @Override
    public void visit(PartA partA) {
        System.out.println("访问part A, 带点苹果");
    }

    @Override
    public void visit(PartB partB) {
        System.out.println("访问part B, 带点梨");
    }

}
