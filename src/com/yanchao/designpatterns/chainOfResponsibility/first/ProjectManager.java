package com.yanchao.designpatterns.chainOfResponsibility.first;

/**
 * @author yanchao
 * @date 2018/3/13 10:49
 */
public class ProjectManager extends Handler {

    public void handleRequest(int count) {
        if (count < 500) {
            System.out.println("ProjectManager审批通过");
        } else if (getHandler() != null) {
            System.out.println("ProjectManager无权处理该请求，交由上一级领导处理");
            getHandler().handleRequest(count);
        } else {
            System.out.println("无法处理该请求");
        }
    }
}
