package com.yanchao.designpatterns.observer.WriterReader;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Client {
    public static void main(String[] args) {
        Writer writer1 = new Writer("池老师");
        Writer writer2 = new Writer("冯老师");

        Reader creader1 = new Reader("池老师读者1");
        Reader creader2 = new Reader("池老师读者2");
        Reader creader3 = new Reader("池老师读者3");

        Reader freader1 = new Reader("冯老师读者1");
        Reader freader2 = new Reader("冯老师读者2");
        Reader freader3 = new Reader("冯老师读者3");

        creader1.subscribe("池老师");
        creader2.subscribe("池老师");
        creader3.subscribe("池老师");

        freader1.subscribe("冯老师");
        freader2.subscribe("冯老师");
        freader3.subscribe("冯老师");

        writer1.publish("MacTalk");
        writer2.publish("小道消息");

        freader1.unSubscribe("冯老师");
        freader2.unSubscribe("冯老师");

        writer1.publish("MacTalk2");
        writer2.publish("小道消息2");
    }
}
