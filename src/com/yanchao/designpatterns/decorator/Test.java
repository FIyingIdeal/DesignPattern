package com.yanchao.designpatterns.decorator;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Test {
    public static void main(String[] args) {
        TheGreatestSage greatestSage = new Monkey();
        greatestSage = new Fish(greatestSage);
        greatestSage = new Bird(greatestSage);

        greatestSage.currentShape();
    }
}
