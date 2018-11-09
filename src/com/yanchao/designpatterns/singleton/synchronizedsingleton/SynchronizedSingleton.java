package com.yanchao.designpatterns.singleton.synchronizedsingleton;

/**
 * Created by Administrator on 2017/2/27.
 * 双重加锁机制实现单利模式
 * 为什么要进行两次 singletion == null 判断，详见代码注释
 *
 * 这种方式依然有可能存在问题，与JVM创建新对象有关，详细见：http://www.cnblogs.com/zuoxiaolong/p/pattern2.html
 * JVM创建新对象主要有三个步骤：1.分配内存；2.初始化构造器；3.将对象指向分配的内存地址。
 * 但2和3步有可能因为JVM针对字节码进行调优而相反，即先将内存地址赋给了对象，然后再进行初始化构造器，
 * 这时候后面的线程去请求getInstance方法时，会认为synchronizedSingleton对象已经实例化了，直接返回一个引用。
 * 如果在初始化构造器之前，这个线程使用了synchronizedSingleton，就会产生莫名的错误。
 *
 * 给静态的实例属性加上关键字volatile可以禁止JVM的指令重排优化，但volatile是JDK1.5以后才有的，代码请参考VolatileSynchronizedSingleton
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getInstance() {
        //第一次进行null判断是为了避免因为锁而造成的无谓等待，即在不为null时，不会加锁
        //如果去掉这个null判断，那么即使null不为空也会加锁，造成无谓的等待。
        if (singleton == null) {
            synchronized (SynchronizedSingleton.class) {
                /*第二次null判断是为了避免在多线程情况下创造多个实例的危险
                 假设A线程和B线程都在同步块外面判断了synchronizedSingleton为null，
                 结果A线程首先获得了线程锁，进入了同步块，然后A线程会创造一个实例，
                 此时synchronizedSingleton已经被赋予了实例，A线程退出同步块，
                 直接返回了第一个创造的实例，此时B线程获得线程锁，也进入同步块，
                 此时A线程其实已经创造好了实例，B线程正常情况应该直接返回的，
                 但是因为同步块里没有判断是否为null，直接就是一条创建实例的语句，
                 所以B线程也会创造一个实例返回，此时就造成创造了多个实例的情况
                */
                if (singleton == null) {
                    singleton = new SynchronizedSingleton();
                }
            }
        }
        return singleton;
    }
}
