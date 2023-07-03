package com.i36ice.example.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class VirtualThreadExample {

    public static void main(String[] args) {

        ThreadFactory factory = Executors.defaultThreadFactory();
        ExecutorService executor = Executors.newFixedThreadPool(100); // 使用固定大小的线程池
        for (int i = 0; i < 1_000_000; i++) {
            Thread virtualThread = factory.newThread(() -> {
                System.out.println("Running in a virtual thread: " + Thread.currentThread().getName());
            });
//            executor.execute(virtualThread);
            virtualThread.start();
//            Runnable task = () -> {
//                System.out.println("Running in a thread: " + Thread.currentThread().getName());
//            };
//            new Thread(task).start();
//            executor.execute(task);

        }
        executor.shutdown();
        System.out.println("Main thread continues to execute");
    }
}
