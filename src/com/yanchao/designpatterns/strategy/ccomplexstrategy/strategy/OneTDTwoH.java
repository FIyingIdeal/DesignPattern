package com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy;

import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.OnceValidRegion;
import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.ValidRegion;

/**
 * Created by Administrator on 2017/2/22.
 */
@OnceValidRegion(@ValidRegion(min = 1000, max = 2000, order = 40))
public class OneTDTwoH implements CalPrice {
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice - 200;
    }
}
