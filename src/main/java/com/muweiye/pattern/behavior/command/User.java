package com.muweiye.pattern.behavior.command;

/**
 * 命令模式<br>
 * 不要把执行的过程传进去
 */
public class User {

    public void func() {

        Command commandA = new CommandA();
        commandA.execute(null);

        Command commandB = new CommandB();
        commandB.execute(null);

    }
}
