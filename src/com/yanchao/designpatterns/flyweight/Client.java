package com.yanchao.designpatterns.flyweight;

/**
 * Created by Administrator on 2016/1/23.
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0 ; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 10; j++) {
                String key = subject + "地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1地点1");
    }
}
