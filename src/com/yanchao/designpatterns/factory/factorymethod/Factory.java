package com.yanchao.designpatterns.factory.factorymethod;

/**
 * Created by Administrator on 2017/3/1.
 * 抽象工厂角色
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
