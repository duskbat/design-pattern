package com.duskbat.pattern.behavior.interpreter;

public class ExpressionOr implements Expression {

    private Expression expression1;
    private Expression expression2;

    public ExpressionOr(Expression text1, Expression text2) {
        this.expression1 = text1;
        this.expression2 = text2;
    }

    @Override
    public void interpreter(String text) {
        expression1.interpreter(text);
        System.out.println("|");
        expression2.interpreter(text);
    }

}
