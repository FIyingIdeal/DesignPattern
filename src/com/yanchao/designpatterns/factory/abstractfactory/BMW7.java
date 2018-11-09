package com.yanchao.designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/3/1.
 */
public abstract class BMW7 implements BMW {

    @Override
    public void performance(int series, int year) {
        System.out.println(year + "款宝马" + series + "系的性能表现...");
    }

    @Override
    public int series() {
        return 7;
    }
}
