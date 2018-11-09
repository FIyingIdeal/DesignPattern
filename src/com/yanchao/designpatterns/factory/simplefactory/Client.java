package com.yanchao.designpatterns.factory.simplefactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Product product = StaticFactory.createProduct(ConcreteProductA.class);
        product.method1();
        product.method2();

        product = StaticFactory.createProduct(ConcreteProductB.class);
        product.method1();
        product.method2();
    }
}
