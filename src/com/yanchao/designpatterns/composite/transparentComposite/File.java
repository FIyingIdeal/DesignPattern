package com.yanchao.designpatterns.composite.transparentComposite;

/**
 * Created by Administrator on 2017/3/9.
 */
public class File extends IFile {
    private String name;
    private IFile folder;

    public File(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void delete() {
        this.folder.deleteFile(this.name);
        System.out.println("删除文件【" + this.name +"】");
    }

    @Override
    public void display() {
        System.out.println("--" + this.name);
    }
}
