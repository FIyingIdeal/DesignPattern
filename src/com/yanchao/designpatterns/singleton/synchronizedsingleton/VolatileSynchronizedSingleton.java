package com.yanchao.designpatterns.singleton.synchronizedsingleton;

/**
 * Created by Administrator on 2017/3/21.
 */
public class VolatileSynchronizedSingleton {
    private static volatile VolatileSynchronizedSingleton singleton;

    public VolatileSynchronizedSingleton() {}

    public static VolatileSynchronizedSingleton getInstance() {
        if (singleton == null) {
            synchronized (VolatileSynchronizedSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileSynchronizedSingleton();
                }
            }
        }
        return singleton;
    }
}
