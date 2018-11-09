package com.yanchao.designpatterns.strategy.complexstrategy.strategy;

import com.yanchao.designpatterns.strategy.complexstrategy.TotalValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@TotalValidRegion(max = 1000)
public class Common implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice;
    }
}
