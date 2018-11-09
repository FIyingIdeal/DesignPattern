package com.yanchao.othercode.test;

//import com.yanchao.javacodelibrary.rmi.IHello;

import java.rmi.Naming;

/**
 * Created by Administrator on 2015/11/23.
 */
public class JavaRMIClient {
    public static void main(String[] args) {
        try {
//            IHello hello = (IHello) Naming.lookup("rmi://192.168.0.88:8888/hello");
//            System.out.println(hello.sayHello("remote pc"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
