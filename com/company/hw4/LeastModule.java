package com.company.hw4;

import java.util.Scanner;

public class LeastModule {
    public static void leastModule() {
        double a, b, c, a1, b1, c1;
        System.out.println("Введите 3 вещественных числа: ");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        if (scanner1.hasNextDouble() && scanner2.hasNextDouble() && scanner3.hasNextDouble()) {
            a = scanner1.nextDouble();
            b = scanner2.nextDouble();
            c = scanner3.nextDouble();
            a1 = a < 0 ? -a : a;
            b1 = b < 0 ? -b : b;
            c1 = c < 0 ? -c : c;
            if (a1 <= b1 && a1 <= c1) {
                System.out.println("Наименьшее число по модулю " + a);
            } else if (b1 <= a1 && b1 <= c1) {
                System.out.println("Наименьшее число по модулю " + b);
            } else if (c1 <= a1 && c1 <= b1) {
                System.out.println("Наименьшее число по модулю " + c);
            }
        } else {
            System.out.println("Вы ввели не вещественное число");
        }
    }

    public static void main(String[] args) {
        leastModule();
    }
}
