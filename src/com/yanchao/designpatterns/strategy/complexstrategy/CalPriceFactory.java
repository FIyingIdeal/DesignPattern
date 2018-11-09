package com.yanchao.designpatterns.strategy.complexstrategy;

import com.yanchao.designpatterns.strategy.complexstrategy.strategy.CalPrice;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */
public class CalPriceFactory {

    private static final String CAL_PRICE_STRATEGY = "com.yanchao.designpatterns.strategy.complexstrategy.strategy";
    private ClassLoader classLoader = getClass().getClassLoader();
    private List<Class<? extends CalPrice>> calPriceList;

    public CalPrice createCalPrice(Customer customer) {

        for (Class<? extends CalPrice> clazz : calPriceList) {
            TotalValidRegion region = handleAnnotation(clazz);
            if (customer.getTotalAmount() >= region.min()
                    && customer.getTotalAmount() < region.max()) {
                try {
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("策略获取失败");
                }
            }
        }
        throw new RuntimeException("策略获取失败");
    }

    private TotalValidRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof TotalValidRegion) {
                return (TotalValidRegion)annotation;
            }
        }
        return null;
    }

    private CalPriceFactory() {
        init();
    }

    private void init() {
        calPriceList = new ArrayList<>();
        File[] resources = getResources();  //获取包下所有的.class文件
        Class<CalPrice> calPriceClazz = null;
        try {
            //使用类加载器加载ClaPrice
            calPriceClazz = (Class<CalPrice>)classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("未找到策略接口");
        }

        for (File resource : resources) {
            try {
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_STRATEGY + "." + resource.getName().replace(".class", ""));
                //Class1.isAssignableFrom(Class2) 判断Class1是否与Class2相同或是Class2的超类或接口
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>)clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_STRATEGY.replace(".", "/")).toURI());
            File[] resources = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });

            //使用java8的Lambda简化代码
            /*File[] resources = file.listFiles(pathname -> {
                if (pathname.getName().endsWith(".class")) {
                    return true;
                }
                return false;
            });*/
            //TODO 测试代码
            System.out.println("-------------classLoader.getResource() begin---------");
            for (File file1 : resources) {
                System.out.println(file1.getName());
            }
            System.out.println("-------------classLoader.getResource() end-----------");

            return resources;
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
    }

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.calPriceFactory;
    }

    //为什么要用一个静态内部类:通过静态内部类实现的单例模式
    private static class CalPriceFactoryInstance {
        private static CalPriceFactory calPriceFactory = new CalPriceFactory();
    }
}
