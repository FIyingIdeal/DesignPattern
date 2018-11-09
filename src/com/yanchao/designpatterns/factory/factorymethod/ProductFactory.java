package com.yanchao.designpatterns.factory.factorymethod;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ProductFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product)Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
