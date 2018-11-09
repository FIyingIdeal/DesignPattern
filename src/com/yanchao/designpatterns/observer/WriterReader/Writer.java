package com.yanchao.designpatterns.observer.WriterReader;

import java.util.Observable;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Writer extends Observable {

    private String writerName;
    private String bookName;

    public Writer(String writerName) {
        this.writerName = writerName;
        WriterManager.getInstance().addWriter(this);
    }

    public String getWriterName() {
        return this.writerName;
    }

    public String getBookName() {
        return this.bookName;
    }

    //发布新书后要通知所有订阅的读者
    public void publish(String bookName) {
        this.bookName = bookName;
        System.out.println(this.writerName + "发布了新书--《" + bookName + "》！");
        changed();
    }

    protected void changed() {
        setChanged();
        notifyObservers();
    }

}
