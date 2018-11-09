package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface Interceptor {
    Object intercept(Invocation invocation) throws Throwable;

    Object register(Object target);
}
