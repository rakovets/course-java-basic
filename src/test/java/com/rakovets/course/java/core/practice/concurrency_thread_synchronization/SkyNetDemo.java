package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.BlueFaction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.RedFaction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads.FactionsThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads.FactoryProduceThread;

public class SkyNetDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Factory factory = new Factory(storage);
        BlueFaction blueFaction = new BlueFaction(storage);
        RedFaction redFaction = new RedFaction(storage);
        Thread factoryProduce = new Thread(new FactoryProduceThread(factory, storage));
        Thread red = new Thread(new FactionsThread(redFaction), "Red team");
        Thread blue = new Thread(new FactionsThread(blueFaction), "Blue team");
        factoryProduce.start();
        red.start();
        blue.start();
    }
}
