package com.yanchao.designpatterns.interpreter;

/**
 * Created by Administrator on 2016/1/23.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
