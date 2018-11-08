package com.company.hw20;

public class MyRunnableSleepDemo {
    public static void main(String[] args) {
        MyRunnableSleep myRunnable = new MyRunnableSleep();

        Thread thread1 = new Thread(myRunnable);
        thread1.setName("First thread");
        thread1.start();
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("Second thread");
        thread2.start();
        Thread thread3 = new Thread(myRunnable);
        thread3.setName("Third thread");
        thread3.start();
    }
}
