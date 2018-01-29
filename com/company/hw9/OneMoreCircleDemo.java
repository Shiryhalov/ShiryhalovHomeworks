package com.company.hw9;

public class OneMoreCircleDemo {
    public static void main(String[] args) {
        OneMoreCircle circle1 = new OneMoreCircle(15);
        OneMoreCircle circle2 = new OneMoreCircle(8);

        System.out.printf("%s%.2f%n", "Площадь = ", circle1.cArea());
        System.out.printf("%s%.2f%n", "Длина окружности = ", circle1.cLength());
        System.out.printf("%s%.2f%n", "Площадь = ", circle2.cArea());
        System.out.printf("%s%.2f%n", "Длина окружности = ", circle2.cLength());
    }
}
