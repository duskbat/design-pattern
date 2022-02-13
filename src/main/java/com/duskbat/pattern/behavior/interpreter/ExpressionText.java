package com.duskbat.pattern.behavior.interpreter;

public class ExpressionText implements Expression {

    @Override
    public void interpreter(String text) {
        System.out.println(text);
    }

}
