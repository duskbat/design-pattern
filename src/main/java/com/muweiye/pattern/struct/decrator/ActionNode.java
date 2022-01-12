package com.muweiye.pattern.struct.decrator;

public class ActionNode extends AbsNode {

    public ActionNode(Node target) {
        super(target);
    }

    @Override
    public <T> void doAction(T param) {
        super.doAction(param);
        System.out.println("A action");
    }
}
