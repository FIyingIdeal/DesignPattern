package com.yanchao.designpatterns.adapter.classAdapter;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.oldMethod();
        target.newMethod();
    }
}
