package com.yanchao.designpatterns.singleton.badsynchronized;

/**
 * Created by Administrator on 2017/2/27.
 * 懒汉模式
 * 这种方式的单例模式在调用getInstance()的时候，其他所有线程都要处于挂起等待状态，
 * 虽然可以避免同步访问创造出多个实例的危险，但会造成很多无所谓的等待
 */
public class BadSynchronizedSingleton {
    private static BadSynchronizedSingleton singleton;

    private BadSynchronizedSingleton() {}

    private synchronized static BadSynchronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new BadSynchronizedSingleton();
        }
        return singleton;
    }
}
