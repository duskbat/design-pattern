package com.muweiye.pattern.behavior.memento;

/**
 * 备忘录 捕获一个对象的内部状态并保存, 可以恢复该状态
 */
public class User {
    public void func() {
        Changing changing = new Changing();
        Memento memento = new Memento();
        changing.saveStateToMemento(memento);
        changing.getStateToMemento(memento);
    }
}
