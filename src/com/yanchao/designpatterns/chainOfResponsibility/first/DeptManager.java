package com.yanchao.designpatterns.chainOfResponsibility.first;

/**
 * @author yanchao
 * @date 2018/3/13 10:53
 */
public class DeptManager extends Handler {

    public void handleRequest(int count) {
        if (count > 500 && count < 1000) {
            System.out.println("DeptManager审批通过");
        } else if (getHandler() != null) {
            System.out.println("DeptManager无权处理该请求，交由上一级领导处理");
            getHandler().handleRequest(count);
        } else {
            System.out.println("无法处理该请求");
        }
    }
}
