package com.yanchao.designpatterns.observer.WriterReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/6.
 */
public class WriterManager {
    private Map<String, Writer> writerMap
             = new HashMap<>();

    private WriterManager() {}

    public void addWriter(Writer writer) {
        writerMap.put(writer.getWriterName(), writer);
    }

    public Writer getWriter(String name) {
        return writerMap.get(name);
    }

    public static WriterManager getInstance() {
        return WriterManagerInstance.manager;
    }

    private static class WriterManagerInstance {
        private static WriterManager manager = new WriterManager();
    }
}
