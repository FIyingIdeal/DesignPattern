package com.yanchao.designpatterns.strategy.easyshopstrategy.strategy;

/**
 * Created by Administrator on 2017/2/22.
 */
public class Vip implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * 0.8;
    }
}
