package com.yanchao.designpatterns.factory.MultiFactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ProductBFactory extends MultiFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
