package com.muweiye.pattern.struct.decrator;

/**
 * 模板
 * 持有Node属性, 子类调用super.doAction()的时候执行持有的Node的方法
 */
public abstract class AbsNode implements Node {

    protected final Node target;

    public AbsNode(Node target) {
        this.target = target;
    }

    @Override
    public <T> void doAction(T param) {
        this.target.doAction(param);
    }

}
