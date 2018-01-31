package com.company.hw3;
import com.company.MethodsForWork;

public class Summ {

    public static void summ() {
        int a, b;
        System.out.println("Введите два целых числа: ");
        a = MethodsForWork.checkInt();
        b = MethodsForWork.checkInt();
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public static void main(String[] arg) {
        summ();
    }
}