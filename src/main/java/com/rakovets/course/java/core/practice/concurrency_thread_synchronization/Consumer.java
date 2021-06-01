package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Consumer extends Thread {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
