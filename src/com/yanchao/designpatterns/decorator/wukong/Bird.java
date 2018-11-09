package com.yanchao.designpatterns.decorator.wukong;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Bird extends Change {

    public Bird (TheGreatestSage greatestSage) {
        super(greatestSage);
    }

    private void getChangeShape() {
        System.out.println("change to bird");
    }
    @Override
    public void currentShape() {
        super.currentShape();
        this.getChangeShape();
    }
}
