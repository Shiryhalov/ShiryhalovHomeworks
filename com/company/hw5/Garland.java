package com.company.hw5;

import com.company.MethodsForWork;

public class Garland {
    private static int getBlinks() {
        int m;
        System.out.println("Сколько раз мигнуть гирлянде?");
        m = MethodsForWork.checkInt();
        return m;
    }

    public static void blink(int a, int m) {
        int i = 0;
        while (i < m) {
            zeros(a);
            a = ~a;
            i++;
        }
    }

    private static void zeros(int a) {
        int zero;
        zero = Integer.toBinaryString(a).length();
        while (zero < 32) {
            System.out.print(0);
            zero++;
        }
        System.out.println(Integer.toBinaryString(a));
    }

    public static void runString(int a, int m) {
        int i = 0;
        while (i < m) {
            zeros(a);
            a = a << 1;
            i++;
        }

    }

    public static void checkFirstLamp(int a) {
        int b;
        b = a & 1;
        if (b == 1) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая лампочка не горит");
        }
    }

    public static void show(int a) {
        zeros(a);
    }

    public static void main(String[] args) {
        int b, m, num = 87381;
        while (true) {
            System.out.println("\nЧто вы хотели бы сделать с гирляндой?");
            System.out.println("1 - Мигание");
            System.out.println("2 - Бегущая строка");
            System.out.println("3 - Узнать, работает ли первая лампочка");
            System.out.println("4 - Просто посмотреть");
            b = MethodsForWork.checkInt();
            switch (b) {
                case 1:
                    m = getBlinks();
                    blink(num, m);
                    break;
                case 2:
                    m = getBlinks();
                    runString(num, m);
                    break;
                case 3:
                    checkFirstLamp(num);
                    break;
                case 4:
                    show(num);
                    break;
                default:
                    System.out.println("Такого варианта нет");
            }
        }
    }
}
