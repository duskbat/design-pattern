package com.muweiye.pattern.struct.adapter;

/**
 * 适配器
 * 适配器实现目标A接口
 * 持有B类对象
 * 用B实际执行A接口的方法
 */
public class User {

    public void func(){
        A adaptor = new Adaptor();
        adaptor.afunc();
    }
}
