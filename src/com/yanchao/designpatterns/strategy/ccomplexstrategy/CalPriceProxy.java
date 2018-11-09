package com.yanchao.designpatterns.strategy.ccomplexstrategy;

import com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy.CalPrice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;

/**
 * Created by Administrator on 2017/2/23.
 */
public class CalPriceProxy implements InvocationHandler {

    private SortedMap<Integer, Class<? extends CalPrice>> sortedMap;

    private CalPriceProxy(SortedMap<Integer, Class<? extends CalPrice>> sortedMap) {
        this.sortedMap = sortedMap;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        double result = 0D;
        if (method.getName().equals("calPrice")) {
            for (Class<? extends CalPrice> clazz : sortedMap.values()) {
                if (result == 0) {
                    result = (double) method.invoke(clazz.newInstance(), args);
                } else {
                    result = (double) method.invoke(clazz.newInstance(), result);
                }
            }
            return result;
        }
        return null;
    }

    public static CalPrice getProxy(SortedMap<Integer, Class<? extends CalPrice>> sortedMap) {
        return (CalPrice) Proxy.newProxyInstance(CalPriceProxy.class.getClassLoader(),
                new Class[] {CalPrice.class}, new CalPriceProxy(sortedMap));
    }
}
