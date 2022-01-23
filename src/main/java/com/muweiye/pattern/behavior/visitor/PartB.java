package com.muweiye.pattern.behavior.visitor;

public class PartB implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
