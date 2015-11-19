package com.yanchao.designpatterns.decorator;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage greatestSage;

    public Change(){}

    public Change(TheGreatestSage greatestSage) {
        this.greatestSage = greatestSage;
    }

    @Override
    public void currentShape() {
        this.greatestSage.currentShape();
    }
}
