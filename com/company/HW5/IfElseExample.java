package com.company.HW5;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число типа Int");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i < 10 && 0 < i) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        } else {
            System.out.println("Программа работает только с Integer");
        }
    }
}
