package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/2/24.
 */
@java.lang.annotation.Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodName {
    String value();
}
