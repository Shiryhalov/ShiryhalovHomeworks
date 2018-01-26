package com.company.hw3;

import java.util.Scanner;

public class Summ {

    public static void summ() {
        int a, b;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        if (scanner1.hasNextInt() && scanner2.hasNextInt()) {
            a = scanner1.nextInt();
            b = scanner2.nextInt();
            System.out.println(a + "+" + b + "=" + (a + b));
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static void main(String[] arg) {
        summ();
    }
}