package com.yanchao.designpatterns.composite.securityComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Folder implements IFile {
    private String name;
    private IFile folder;
    private List<IFile> files;

    public Folder(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
        files = new ArrayList<>();
    }

    public Folder(String name) {
        this(name, null);
    }

    @Override
    public void delete() {
        //将该文件夹下的原始文件copy一份，不然的话既遍历又修改会报ConcurrentModificationException
        List<IFile> copyFiles = new ArrayList<>(files);
        for (IFile file : copyFiles) {
            file.delete();
        }
        System.out.println("删除文件夹【" + this.name + "】");
        if (folder != null) {
            ((Folder)folder).deleteFile(this.name);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void createFile(String name) {
        if (name != null && name.contains(".")) {
            files.add(new File(name, this));
        } else {
            files.add(new Folder(name, this));
        }
    }

    public void deleteFile(String name) {
        for (IFile file : files) {
            if (Objects.equals(name, file.getName())) {
                files.remove(file);
                break;
            }
        }
    }

    public IFile getFile(int index) {
        return this.files.get(index);
    }

    public void display() {
        System.out.println(this.name);
        for (IFile file : files) {
            file.display();
        }
    }
}
