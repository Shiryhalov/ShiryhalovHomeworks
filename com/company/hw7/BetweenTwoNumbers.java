package com.company.hw7;

public class BetweenTwoNumbers {
    public BetweenTwoNumbers() {
    }

    public int beetween(int a, int b) {
        if (a == b - 1 || a > b - 1) {
            return a;
        } else {
            a++;
            System.out.println(a);
            beetween(a, b);
            return a;
        }
    }
}
