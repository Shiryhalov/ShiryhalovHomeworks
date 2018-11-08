package com.company.hw20;

public class StringBuilderThreadDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");

        Thread thread1 = new StringBuilderThread(sb);
        Thread thread2 = new StringBuilderThread(sb);
        Thread thread3 = new StringBuilderThread(sb);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
