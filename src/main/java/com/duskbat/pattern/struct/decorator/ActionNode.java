package com.duskbat.pattern.struct.decorator;

public class ActionNode extends AbsNode {

    public ActionNode(Node target) {
        super(target);
    }

    @Override
    public <T> void doAction(T param) {
        // 执行持有的Node的doAction()
        super.doAction(param);
        System.out.println("A action");
    }

}
