package com.yanchao.designpatterns.factory.MultiFactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        MultiFactory factory = new ProductAFactory();
        Product productA = factory.createProduct();
        productA.method1();
        productA.method2();

        factory = new ProductBFactory();
        Product productB = factory.createProduct();
        productB.method1();
        productB.method2();
    }
}
