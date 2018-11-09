package com.yanchao.designpatterns.chainOfResponsibility.first;

/**
 * @author yanchao
 * @date 2018/3/13 10:56
 */
public class GeneralManager extends Handler {

    @Override
    public void handleRequest(int count) {
        if (count > 1000) {
            System.out.println("GeneralManager审批通过");
        } else {
            System.out.println("无人能审批该请求");
        }
    }
}
