package com.yanchao.designpatterns.singleton.innerclass;

/**
 * Created by Administrator on 2017/3/21.
 */
public class Client {

    public static void main(String[] args) {
        Singleton.doSomething();
        //Singleton doSomething()!

        Singleton singleton = Singleton.getInstance();
        //Inner static class loaded!
    }
}
