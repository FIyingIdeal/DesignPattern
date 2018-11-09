package com.yanchao.designpatterns.singleton.innerclass;

/**
 * Created by Administrator on 2017/2/27.
 * 安全优雅的单例模式实现：使用静态内部类实现单例
 * 因为类的静态属性只会在“第一次加载类”的时候“初始化一次”，这是JVM帮我们保证的，
 * 所以在初始化进行到一半的时候，别的线程无法使用，JVM会强行同步这个过程，所以我们无需担心并发访问的问题
 */
public class Singleton {

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance {
        static {
            System.out.println("Inner static class loaded!");
        }
        private static Singleton instance = new Singleton();
    }

    //在直接通过Singleton.doSomething()方式调用与实例无关的static方法时，不会引起静态内部类的加载
    public static void doSomething() {
        System.out.println("Singleton doSomething()!");
    }
}
