package com.company.HW3;

import java.util.Scanner;

public class ParityCheck {

    public static void parityCheck() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Введенное число четное");
            } else {
                System.out.println("Введенное число нечетное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static void main(String[] arg) {
        parityCheck();
    }
}