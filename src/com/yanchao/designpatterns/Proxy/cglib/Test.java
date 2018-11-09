package com.yanchao.designpatterns.Proxy.cglib;

/**
 * Created by Administrator on 2016/1/22.
 */
public class Test {
    public static void main(String[] args) {
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
        peopleTalk.talk("yes");
    }
}
