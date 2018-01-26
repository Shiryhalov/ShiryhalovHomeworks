package com.company.hw4;

public class EvenNum {
    public static void main(String[] args) {
        int a;
        if (args.length > 0) {
            a = Integer.parseInt(args[0]);
            if (a % 2 != 0) {
                System.out.println("Число нечетное и равно " + a);
            }
        } else {
            System.out.println("Введите число в аргументы");
        }
    }
}
