package com.duskbat.pattern.struct.decorator;

/**
 * 抽象父类<br>
 * 持有Node属性, 子类调用super.doAction()的时候执行持有的Node的doAction()
 */
public abstract class AbsNode implements Node {

    protected final Node target;

    /**
     * 抽象类的构造函数<br>
     * 1. 初始化属性<br>
     * 2. 给子类调用
     *
     * @param target 属性
     */
    protected AbsNode(Node target) {
        this.target = target;
    }

    @Override
    public <T> void doAction(T param) {
        target.doAction(param);
    }

}
