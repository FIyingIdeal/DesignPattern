package com.yanchao.designpatterns.singleton.normal;

/**
 * Created by Administrator on 2017/2/27.
 * 标准的单例模式，但在多线程情况下，如果线程A调用 if(singleton == null) 后但还没有创建出instance，
 * 此时线程A被切换到可执行状态，线程B执行了if判断，此时的singleton仍然是null，那么仍然会执行到if语句块，
 * 这样的话就会出现两个实例...
 */
public class NormalSingleton {

    //静态实例，保证每一个类只有一个该实例
    private static NormalSingleton singleton;

    //私有的构造函数，限制客户端随意创造实例
    private NormalSingleton() {}

    //静态方法，该方法是在未获取到实例的情况下提供给用户调用的，
    //所以必须是一个static方法，否则是一个矛盾体了。非static方法必须使用实例来调用
    public static NormalSingleton getInstance() {
        if (singleton == null) {
            singleton = new NormalSingleton();
        }
        return singleton;
    }
}
