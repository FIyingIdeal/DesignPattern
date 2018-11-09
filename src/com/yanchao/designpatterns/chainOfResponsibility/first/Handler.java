package com.yanchao.designpatterns.chainOfResponsibility.first;

/**
 * @author yanchao
 * @date 2018/3/13 10:45
 */
public abstract class Handler {

    protected Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(int count);
}
