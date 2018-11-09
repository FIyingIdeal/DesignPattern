package com.yanchao.designpatterns.composite.transparentComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Folder extends IFile {

    private String name;
    private IFile folder;
    private List<IFile> files;

    public Folder(String name, IFile folder) {
        this.name = name;
        this.folder = folder;
        this.files = new ArrayList<>();
    }

    public Folder(String name) {
        this(name, null);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void delete() {
        List<IFile> copyFiles = new ArrayList<>(files);
        for (IFile file : copyFiles) {
            file.delete();
        }
        if (folder != null) {
            folder.deleteFile(this.name);
            System.out.println("删除文件夹【" + this.name + "】");
        }
    }

    @Override
    public void createFile(String name) {
        if (name.contains(".")) {
            this.files.add(new File(name, this));
        } else {
            this.files.add(new Folder(name, this));
        }
    }

    @Override
    public void deleteFile(String name) {
        for (IFile file : files) {
            if (Objects.equals(name, file.getName())) {
                files.remove(file);
                break;
            }
        }
    }

    @Override
    public IFile getFile(int index) {
        return this.files.get(index);
    }

    @Override
    public void display() {
        System.out.println(this.name);
        for (IFile file : files) {
            file.display();
        }
    }
}
