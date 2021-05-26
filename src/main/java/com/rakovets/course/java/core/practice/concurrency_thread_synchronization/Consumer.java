package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.io.IOException;

public class Consumer implements Runnable {
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                store.consume();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
