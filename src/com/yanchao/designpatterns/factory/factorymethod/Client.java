package com.yanchao.designpatterns.factory.factorymethod;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ProductFactory();
        Product product = factory.createProduct(ConcreteProductA.class);
        product.method1();
        product.method2();

        product = factory.createProduct(ConcreteProductB.class);
        product.method1();
        product.method2();
    }
}
