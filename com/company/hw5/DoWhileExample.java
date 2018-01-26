package com.company.hw5;

public class DoWhileExample {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }
        while (n <= 100);
    }
}
