package com.yanchao.designpatterns.factory.MultiFactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ConcreteProductB implements Product {
    @Override
    public void method1() {
        System.out.println("ProductB method1");
    }

    @Override
    public void method2() {
        System.out.println("ProductB method2");
    }
}
