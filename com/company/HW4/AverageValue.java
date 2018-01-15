package com.company.HW4;

public class AverageValue {
    public static void main(String[] args) {
        double a, b = 0;
        if (args.length > 0) {
            for (String str : args) {
                a = Double.parseDouble(str);
                b += a;
            }
            System.out.println("Среднее значение = " + b / 3);
        } else {
            System.out.println("Введите числа в аргументы");
        }
    }
}