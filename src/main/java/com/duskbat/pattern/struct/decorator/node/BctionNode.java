package com.duskbat.pattern.struct.decorator.node;

public class BctionNode extends AbsNode {

    public BctionNode(Node target) {
        super(target);
    }

    @Override
    public <T> void doAction(T param) {

        super.doAction(param);
        System.out.println("B action");
    }
}
