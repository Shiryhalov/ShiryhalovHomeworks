package com.company.hw11;

import com.company.hw7.Book;

public class Wrappers {
    public static void main(String[] args) {
        Double double1 = 123.5;
        Double double2 = 123.6;
        Double double3 = new Double("123");
        Double double4 = Double.valueOf("6");
        Double double5 = 6.3;
        double double6 = Double.parseDouble("345.6");
        String double7 = Double.toString(3.14);

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);
        System.out.println(double6);
        System.out.println(double7);
        System.out.println("Преобразования типов: ");
        System.out.println(double1.byteValue());
        System.out.println(double1.floatValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.shortValue());

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
