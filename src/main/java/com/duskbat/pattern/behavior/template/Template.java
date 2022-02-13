package com.duskbat.pattern.behavior.template;

public abstract class Template {

    void coreFunc() {
        doActionA();
        doActionB();
        doActionC();
    }

    abstract void doActionA();

    abstract void doActionB();

    abstract void doActionC();

}
