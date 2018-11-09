package com.yanchao.designpatterns.flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/1/23.
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "----------产生一个对象放入池中！");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            System.out.println(key + "----------从池中获取对象");
            result = pool.get(key);
        }
        return result;
    }
}
