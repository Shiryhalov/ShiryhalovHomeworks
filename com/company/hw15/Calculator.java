package com.company.hw15;

public class Calculator {
    public Calculator() {
    }

    public static <T extends Number, V extends Number> Double sum(T x, V y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number, V extends Number> Double multiply(T x, V y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number, V extends Number> Double divide(T x, V y) {
        if (x.doubleValue() != 0 && y.doubleValue() != 0) {
            return x.doubleValue() / y.doubleValue();
        } else {
            return 0.0;
        }
    }

    public static <T extends Number, V extends Number> Double subtraction(T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("3.2 + 7 = " + Calculator.sum(3.2, 7));
        System.out.println("4.3 * 2 = " + Calculator.multiply(4.3, 2));
        System.out.println("3.1 / 0 = " + Calculator.divide(3, 0));
        System.out.println("6.3 / 2.1 = " + Calculator.divide(6.3, 2.1));
        System.out.println("13.5 - 8 = " + Calculator.subtraction(13.5, 8));
    }
}
