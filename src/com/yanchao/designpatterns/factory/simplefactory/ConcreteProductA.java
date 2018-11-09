package com.yanchao.designpatterns.factory.simplefactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ConcreteProductA implements Product {
    @Override
    public void method1() {
        System.out.println("ProductA method1");
    }

    @Override
    public void method2() {
        System.out.println("ProductA method2");
    }
}
