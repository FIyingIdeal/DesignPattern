package com.yanchao.designpatterns.strategy.easyshopstrategy;

import com.yanchao.designpatterns.strategy.easyshopstrategy.strategy.*;

/**
 * Created by Administrator on 2017/2/22.
 */
public class CalPriceFactory {

    private CalPriceFactory() {}

    public static CalPrice getCalPrice(double totalAmount) {
        CalPrice calPrice = new Common();
        if (totalAmount > 3000) {
            calPrice = new GoldVip();
        } else if (totalAmount > 2000) {
            calPrice = new SuperVip();
        } else if (totalAmount > 1000) {
            calPrice = new Vip();
        }
        return calPrice;
    }
}
