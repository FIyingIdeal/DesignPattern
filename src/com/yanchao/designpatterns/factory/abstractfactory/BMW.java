package com.yanchao.designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/3/1.
 * 产品的抽象，模拟一个宝马
 */
public interface BMW {
    void performance(int series, int year);     //性能
    int series();          //系列
    int year();             //年代
}
