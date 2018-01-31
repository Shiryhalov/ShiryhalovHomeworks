package com.company.hw4;

import com.company.MethodsForWork;

public class LeastModule {
    public static void leastModule() {
        double a, b, c, a1, b1, c1;
        System.out.println("Введите 3 вещественных числа: ");
        a = MethodsForWork.checkDouble();
        b = MethodsForWork.checkDouble();
        c = MethodsForWork.checkDouble();
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
    }

    public static void main(String[] args) {
        leastModule();
    }
}
