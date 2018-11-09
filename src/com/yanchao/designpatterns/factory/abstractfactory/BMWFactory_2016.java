package com.yanchao.designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/3/1.
 * 宝马2016款车型生产“线”
 */
public class BMWFactory_2016 implements BMWFactory {
    @Override
    public BMW createBMW5() {
        return new BMW5_2016();
    }

    @Override
    public BMW createBMW7() {
        return new BMW7_2016();
    }
}
