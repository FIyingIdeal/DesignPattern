package com.yanchao.designpatterns.strategy.complexstrategy.strategy;

import com.yanchao.designpatterns.strategy.complexstrategy.TotalValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@TotalValidRegion(min = 2000, max = 3000)
public class SuperVip implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * 0.7;
    }
}
