package com.muweiye.pattern.behavior.state;

/**
 * 状态模式<br>
 * 对象内部状态改变时改变它的行为, 对象看起来似乎修改了它的类<br>
 * 状态本身会修改上下文完成状态转移, 不让User主动控制状态
 */
public class User {
    public void func() {
        State stateA = new StateA();

        Context context = new Context();
        context.setState(stateA);
        context.doAction();
        context.doAction();

    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }

}
