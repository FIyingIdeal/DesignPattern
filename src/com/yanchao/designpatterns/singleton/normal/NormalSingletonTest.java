package com.yanchao.designpatterns.singleton.normal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/2/27.
 */
public class NormalSingletonTest {
    boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 100;
        final Set<String> instances = Collections.synchronizedSet(new HashSet<String>());
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(num);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < num; i++) {
            executorService.execute(() -> {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                NormalSingleton singleton = NormalSingleton.getInstance();
                instances.add(singleton.toString());
            });
        }
        Thread.sleep(5000);

        for (String instance : instances) {
            System.out.println(instance);
        }
        executorService.shutdown();
    }
}
