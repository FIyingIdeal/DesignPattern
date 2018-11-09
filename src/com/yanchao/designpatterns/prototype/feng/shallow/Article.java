package com.yanchao.designpatterns.prototype.feng.shallow;

import java.time.LocalDate;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Article implements Cloneable {

    private String name;    //标题
    private String author;  //作者
    private LocalDate date; //发表时间
    private String content; //内容
    private Link link;

    public Article(String name, String author, LocalDate date, String content) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.content = content;
    }

    public Article(String name, String author, String content) {
        this(name, author, LocalDate.now(), content);
    }

    public Article(String name, LocalDate date, String content) {
        this(name, "小道消息", LocalDate.now(), content);
    }

    public Article(String name, String content) {
        this(name, "小道消息", content);
    }

    public Article(Link link) {
        this(link.getName(), link.getLinkAddr());
        this.link = link;
    }

    @Override
    public Article clone() {
        Article article = null;
        try {
            article = (Article)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        article.link = this.link.clone();
        return article;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }

    public Link getPushedLink() {
        Link articleLink = new Link(this.getName(),
                "http://mp.weixin.qq.com/s/cWQvfNTxJiA36m-DHAZj-A");
        return articleLink;
    }

    public static void main(String[] args) {
        Article historyArticle = new Article("写一封「用户体验」良好的求职邮件",
                LocalDate.parse("2014-04-29"), "昨天抛出了一个话题...");

        Link link = historyArticle.getPushedLink();

        Article imagine = new Article(historyArticle.getName(), historyArticle.getContent());
        imagine.setLink(link);
        System.out.println("今天推送的历史文章想象中应该是这样：" + imagine);
        Article actual = imagine.clone();
        System.out.println("实际推送的文章是这样(clone出来的)： " + actual);
        System.out.println("imagine.getLink() == actual.getLink() :" + (imagine.getLink() == actual.getLink()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
