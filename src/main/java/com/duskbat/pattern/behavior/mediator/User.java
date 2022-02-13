package com.duskbat.pattern.behavior.mediator;

/**
 * 中介模式<br>
 * 减少Part之间通信的复杂性
 * 如: 聊天室
 */
public class User {

    public void func() {
        Part partA = new PartA();
        Part partB = new PartB();
        partA.doAction();
        partB.doAction();
    }

}
