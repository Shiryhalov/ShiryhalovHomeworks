package com.company.hw5;

public class Factorial {
    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }

    public static void main(String[] args) {
        int x = (int) (Math.random() * 8);
        System.out.println("Факториал числа " + x + " равен " + factorial(x));
    }
}
