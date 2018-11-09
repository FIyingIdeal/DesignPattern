package com.yanchao.designpatterns.singleton.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/3/1.
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            //获取无参构造器
            Constructor constructor = clazz.getConstructor();
            //设置无参构造函数可访问
            constructor.setAccessible(true);
            //产生实例对象
            singleton = (Singleton)constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
