package com.yanchao.designpatterns.observer.WriterReader;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Reader implements Observer {

    private String readerName;

    public Reader() {}
    public Reader(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderName() {
        return this.readerName;
    }

    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    public void unSubscribe(String writerName) {
        System.out.println(this.readerName + "取消了对 "
                + writerName + " 的订阅");
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer)o;
            System.out.println(writer.getWriterName()
                + "发布了新书--《" + writer.getBookName() + "》，"
                    + this.readerName + "已收到通知完成订阅！");
        }
    }
}
