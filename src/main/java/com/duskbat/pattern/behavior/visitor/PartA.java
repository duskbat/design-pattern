package com.duskbat.pattern.behavior.visitor;

public class PartA implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
