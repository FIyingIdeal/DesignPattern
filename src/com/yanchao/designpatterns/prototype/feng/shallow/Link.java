package com.yanchao.designpatterns.prototype.feng.shallow;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Link implements Cloneable {
    private String name;        //链接名字
    private String linkAddr;    //链接地址

    public Link(String name, String linkAddr) {
        this.name = name;
        this.linkAddr = linkAddr;
    }

    @Override
    public Link clone() {
        Link link = null;
        try {
            link = (Link)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", linkAddr='" + linkAddr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkAddr() {
        return linkAddr;
    }

    public void setLinkAddr(String linkAddr) {
        this.linkAddr = linkAddr;
    }
}
