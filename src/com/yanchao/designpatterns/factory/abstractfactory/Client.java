package com.yanchao.designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        BMWFactory factory = new BMWFactory_2016();
        BMW bmw5 = factory.createBMW5();
        bmw5.performance(bmw5.series(), bmw5.year());
        BMW bmw7 = factory.createBMW7();
        bmw7.performance(bmw7.series(), bmw7.year());

        factory = new BMWFactory_2017();
        bmw5 = factory.createBMW5();
        bmw5.performance(bmw5.series(), bmw5.year());
        bmw7 = factory.createBMW7();
        bmw7.performance(bmw7.series(), bmw7.year());
    }
}
