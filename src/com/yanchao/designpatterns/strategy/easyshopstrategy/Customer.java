package com.yanchao.designpatterns.strategy.easyshopstrategy;

import com.yanchao.designpatterns.strategy.easyshopstrategy.strategy.*;

/**
 * Created by Administrator on 2017/2/22.
 */
public class Customer {

    private CalPrice calPrice = new Common();

    private double totalAmount = 0;
    private double amount = 0;

    /*public void buy(double amount) {
        this.amount = amount;
        this.totalAmount += amount;
        if (totalAmount > 3000) {
            calPrice = new GoldVip();
        } else if (totalAmount > 2000) {
            calPrice = new SuperVip();
        } else if (totalAmount > 1000) {
            calPrice = new Vip();
        }
    }*/

    public void buy(double amount) {
        this.amount = amount;
        this.totalAmount += amount;
        calPrice = CalPriceFactory.getCalPrice(totalAmount);
    }

    public double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public void setCalPrice(CalPrice calPrice) {
        this.calPrice = calPrice;
    }
}
