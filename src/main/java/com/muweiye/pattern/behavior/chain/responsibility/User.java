package com.muweiye.pattern.behavior.chain.responsibility;

import com.muweiye.pattern.behavior.chain.responsibility.handler.Handler1;
import com.muweiye.pattern.behavior.chain.responsibility.handler.Handler2;
import com.muweiye.pattern.behavior.chain.responsibility.handler.Handler3;

public class User {

    public void func() {
        Chain chain = new Chain();
        chain.addHandler(new Handler1());
        chain.addHandler(new Handler2());
        chain.addHandler(new Handler3());
        chain.process();
    }

    public static void main(String[] args) {
        new User().func();
    }
}
