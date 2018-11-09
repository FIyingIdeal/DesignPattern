package com.yanchao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/1/23.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
