package com.yanchao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/1/23.
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
