package com.duskbat.pattern.struct.facade;

/**
 * 外观模式<br>
 * 通过外观 Facade 给用户一个入口，屏蔽细节
 */
public class User {

    public void func() {
        new Facade().func();
    }

}
