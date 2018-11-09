package com.yanchao.designpatterns.singleton.hunger;

/**
 * Created by Administrator on 2017/2/27.
 * 饿汉模式的单例
 * 这种方式可以避免并发情况下创造出多个实例的情况，
 * 但缺点是在访问类内的任何其他静态方法，都会造成实例的初始化，不管是否有用到该实例
 */
public class HungerSingleton {
    private static HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton() {}

    public static HungerSingleton getInstance() {
        return singleton;
    }

    //其他方法
    public static void doSomething() {
        System.out.println();
    }
}
