package com.yanchao.designpatterns.strategy.complexstrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/2/22.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TotalValidRegion {
    int max() default Integer.MAX_VALUE;
    int min() default Integer.MIN_VALUE;
}
