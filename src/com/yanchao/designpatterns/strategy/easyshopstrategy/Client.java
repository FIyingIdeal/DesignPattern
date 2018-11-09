package com.yanchao.designpatterns.strategy.easyshopstrategy;

/**
 * Created by Administrator on 2017/2/22.
 */
public class Client {

    public static void main(String[] args) {
        double price = 500;
        Customer customer = new Customer();
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 1500;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 2500;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 3500;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());
    }
}
