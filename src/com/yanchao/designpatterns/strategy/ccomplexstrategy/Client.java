package com.yanchao.designpatterns.strategy.ccomplexstrategy;

/**
 * Created by Administrator on 2017/2/24.
 */
public class Client {
    public static void main(String[] args) {
        double price = 1000;
        Customer customer = new Customer();
        customer.buy(1000);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());


        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 1500;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 2000;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());

        price = 3500;
        customer.buy(price);
        System.out.println("buy " + price + " will pay " + customer.calLastAmount());
    }
}
