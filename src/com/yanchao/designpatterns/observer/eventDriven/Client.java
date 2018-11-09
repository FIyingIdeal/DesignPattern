package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Client {
    public static void main(String[] args) {
        ButtonJSP buttonJSP = new ButtonJSP();
        Button button = buttonJSP.getButton();
        button.onClick();
        button.doubleClick();
        button.mouseMove(2,4);
    }
}
