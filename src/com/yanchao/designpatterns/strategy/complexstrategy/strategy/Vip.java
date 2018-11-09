package com.yanchao.designpatterns.strategy.complexstrategy.strategy;

import com.yanchao.designpatterns.strategy.complexstrategy.TotalValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@TotalValidRegion(min = 1000, max = 2000)
public class Vip implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * 0.8;
    }
}
