package com.yanchao.designpatterns.composite.securityComposite;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Client {
    public static void main(String[] args) {
        Folder root = new Folder("我的电脑");
        root.createFile("C");
        root.createFile("D");
        root.createFile("E");

        Folder folderD = (Folder)root.getFile(1);
        folderD.createFile("fileA.txt");
        folderD.createFile("fileB.txt");
        folderD.createFile("folderF");
        Folder folderF = (Folder)folderD.getFile(2);
        folderF.createFile("fileC.txt");
        root.display();

        System.out.println("--------Delete File fileA.txt");
        folderD.deleteFile("fileA.txt");
        root.display();

        System.out.println("--------Delete Folder folderD");
        folderD.delete();
        root.display();

        System.out.println("---------Delete all");
        root.delete();
        root.display();
    }
}
