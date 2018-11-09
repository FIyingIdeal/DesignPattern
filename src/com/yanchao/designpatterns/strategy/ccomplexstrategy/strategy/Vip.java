package com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy;

import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.TotalValidRegion;
import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.ValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@TotalValidRegion(@ValidRegion(min = 1000, max = 2000, order = 99))
public class Vip implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * 0.8;
    }
}
