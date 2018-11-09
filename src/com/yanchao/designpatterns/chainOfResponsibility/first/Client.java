package com.yanchao.designpatterns.chainOfResponsibility.first;

/**
 * @author yanchao
 * @date 2018/3/13 10:59
 */
public class Client {

    public static void main(String[] args) {
        Handler projectManager = new ProjectManager();
        Handler deptManager = new DeptManager();
        Handler generalManager = new GeneralManager();

        projectManager.setHandler(deptManager);
        deptManager.setHandler(generalManager);

        projectManager.handleRequest(3000);
    }
}
