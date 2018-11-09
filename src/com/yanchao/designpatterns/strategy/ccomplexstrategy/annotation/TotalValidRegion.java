package com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation;

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
    //引用有效区间注解
    ValidRegion value() default @ValidRegion;
}
