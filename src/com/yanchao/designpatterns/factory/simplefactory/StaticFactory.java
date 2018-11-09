package com.yanchao.designpatterns.factory.simplefactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class StaticFactory {

    public static <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
