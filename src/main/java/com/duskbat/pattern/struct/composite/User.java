package com.duskbat.pattern.struct.composite;

/**
 * 组合模式<br>
 * 就是个树形结构, 没啥好说的
 */
public class User {

    public void func() {
        Element element = new Element("root");
        Element a = new Element("a");
        Element b = new Element("b");
        a.add(new Element("aa"));
        a.add(new Element("ab"));
        element.add(a);
        element.add(b);
    }

}
