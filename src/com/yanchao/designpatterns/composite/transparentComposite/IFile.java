package com.yanchao.designpatterns.composite.transparentComposite;

/**
 * Created by Administrator on 2017/3/9.
 */
public abstract class IFile {

    public abstract String getName();

    public abstract void delete();

    public void createFile(String name) {
        throw new UnsupportedOperationException("不支持创建文件操作");
    }

    public void deleteFile(String name) {
        throw new UnsupportedOperationException("不支持删除文件操作");
    }

    public IFile getFile(int index) {
        throw new UnsupportedOperationException("不支持获取文件操作");
    }

    public abstract void display();

}
