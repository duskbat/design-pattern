package com.muweiye.pattern.behavior.mediator;

/**
 * 可以不持有 part, 只对其做处理
 */
public class Mediator {

    public static void deal(Part part) {
        System.out.println(part.toString());
    }

}
