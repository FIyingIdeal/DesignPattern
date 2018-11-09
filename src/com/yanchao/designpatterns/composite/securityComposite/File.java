package com.yanchao.designpatterns.composite.securityComposite;

/**
 * Created by Administrator on 2017/3/9.
 */
public class File implements IFile {
    private String name;
    private IFile folder;

    public File(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
    }

    @Override
    public void delete() {
        System.out.println("删除文件【" + this.name + "】");
        ((Folder) folder).deleteFile(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display() {
        System.out.println("--" + this.name);
    }
}
