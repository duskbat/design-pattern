package com.muweiye.pattern.struct.decrator;

import com.muweiye.pattern.struct.decrator.node.ActionNode;
import com.muweiye.pattern.struct.decrator.node.BctionNode;
import com.muweiye.pattern.struct.decrator.node.HeadNode;
import com.muweiye.pattern.struct.decrator.node.Node;

/**
 * 装饰器模式<br>
 * 动态地给对象添加一些职责, 比生成子类更灵活<br>
 * 通过持有属性的方式执行属性里面的代码
 */
public class User {

    public void func() {
        Node node1 = new HeadNode();
        Node node2 = new ActionNode(node1);
        Node node3 = new BctionNode(node2);
        node3.doAction(new Object());
    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }

}
