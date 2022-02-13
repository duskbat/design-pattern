package com.duskbat.pattern.behavior.interpreter;

/**
 * 解释器<br>
 * 属性和方法传参之间的取舍:<br>
 * 如果一次构造, 多次使用, 那么就使用构造方法一次传入;<br>
 * 如果只使用一次, 每次入都不一样, 就方法传参即可好了
 */
public class User {

    public void func() {
        String s = "wwwww";

        Expression expression = new ExpressionText();

        Expression and = new ExpressionAnd(expression, expression);
        Expression or = new ExpressionOr(expression, expression);

        and.interpreter(s);
        or.interpreter(s);

    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }

}
