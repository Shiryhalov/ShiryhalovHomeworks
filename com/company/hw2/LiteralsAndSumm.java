package com.company.hw2;

public class LiteralsAndSumm {

    public static int summ(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        /**
         * Объявление литералов
         */
        int x1 = 13_45;
        int x2 = 011;
        int x3 = 0x7ddffff;
        int x4 = 0b101;
        long x5 = 220433L;
        double x6 = 14.35D;
        float x7 = 78.45f;
        boolean x8 = true;
        char x9 = '\u004F';
        String x10 = "My Program";

        /**
         * Вывод на экран
         */
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);
        System.out.println(x9);
        System.out.println(x10);
        System.out.println(summ(3, 5)); //вывод на экран результат работы метода Summ
    }
}
