package com.yanchao.designpatterns.decorator.wukong;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Fish extends Change {

    public Fish (TheGreatestSage greatestSage) {
        super(greatestSage);
    }

    private void getChangeShape() {
        System.out.println("change to fish");
    }

    @Override
    public void currentShape() {
        super.currentShape();
        this.getChangeShape();
    }
}
