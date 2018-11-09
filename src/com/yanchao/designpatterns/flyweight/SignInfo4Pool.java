package com.yanchao.designpatterns.flyweight;

/**
 * Created by Administrator on 2016/1/23.
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
