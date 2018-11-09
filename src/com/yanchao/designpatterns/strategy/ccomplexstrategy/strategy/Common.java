package com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy;

import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.TotalValidRegion;
import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.ValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@TotalValidRegion(@ValidRegion(max = 1000, order = 99))
public class Common implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice;
    }
}
