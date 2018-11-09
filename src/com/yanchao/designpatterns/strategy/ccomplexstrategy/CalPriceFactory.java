package com.yanchao.designpatterns.strategy.ccomplexstrategy;

import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.OnceValidRegion;
import com.yanchao.designpatterns.strategy.ccomplexstrategy.annotation.TotalValidRegion;
import com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy.CalPrice;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/2/22.
 */
public class CalPriceFactory {

    private static final String CAL_PRICE_STRATEGY = "com.yanchao.designpatterns.strategy.ccomplexstrategy.strategy";
    private ClassLoader classLoader = getClass().getClassLoader();
    private List<Class<? extends CalPrice>> clazzList;

    public CalPrice createCalPrice(Customer customer) {
        SortedMap<Integer, Class<? extends CalPrice>> sortedMap = new TreeMap<>();
        for (Class<? extends CalPrice> clazz : clazzList) {
            Annotation annotation = handleAnnotation(clazz);
            if (annotation instanceof OnceValidRegion) {
                OnceValidRegion onceValidRegion = (OnceValidRegion)annotation;
                if (customer.getAmount() >= onceValidRegion.value().min()
                        && customer.getAmount() < onceValidRegion.value().max()) {
                    sortedMap.put(onceValidRegion.value().order(), clazz);
                }
            } else if (annotation instanceof TotalValidRegion) {
                TotalValidRegion totalValidRegion = (TotalValidRegion)annotation;
                if (customer.getTotalAmount() >= totalValidRegion.value().min()
                        && customer.getAmount() < totalValidRegion.value().max()) {
                    sortedMap.put(totalValidRegion.value().order(), clazz);
                }
            }
        }
        return CalPriceProxy.getProxy(sortedMap);
    }

    private Annotation handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof TotalValidRegion || annotation instanceof OnceValidRegion) {
                return annotation;
            }
        }
        return null;
    }

    private CalPriceFactory() {
        init();
    }

    private void init() {
        clazzList = new ArrayList<>();
        Class<CalPrice> calPrice = null;
        File[] resources = getResources();
        try {
            calPrice = (Class<CalPrice>)classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("策略加载失败");
        }
        for (File resource : resources) {
            try {
                Class<? extends CalPrice> clazz = (Class<? extends CalPrice>)classLoader.loadClass(
                        CAL_PRICE_STRATEGY + "." + resource.getName().replace(".class", ""));
                if (calPrice.isAssignableFrom(clazz) && calPrice != clazz) {
                    clazzList.add(clazz);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("策略加载失败");
            }
        }
    }

    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_STRATEGY.replace(".", "/")).toURI());
            return file.listFiles(pathname -> {
                if (pathname.getName().endsWith(".class")) {
                    return true;
                }
                return false;
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("加载资源失败");
        }
    }

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }
}
