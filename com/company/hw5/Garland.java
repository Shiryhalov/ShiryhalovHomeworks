package com.company.hw5;

import java.util.Scanner;

public class Garland {
    public static void garland1(int a) {
        int i = 0, b, zero;
        System.out.println("Сколько раз мигнуть гирлянде?");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            while (i < b) {
                zero = Integer.toBinaryString(a).length();
                if (zero < 32) {
                    while (zero < 32) {
                        System.out.print(0);
                        zero++;
                    }
                    System.out.print(Integer.toBinaryString(a) + "\n");
                } else {
                    System.out.println(Integer.toBinaryString(a));
                }
                a = ~a;
                i++;
            }
        } else {
            System.out.println("Столько раз мигнуть не получится");
        }
    }

    public static void garland2(int a) {
        int i = 0, b, zero;
        System.out.println("Сколько раз мигнуть гирлянде?");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            while (i < b) {
                zero = Integer.toBinaryString(a).length();
                if (zero < 32) {
                    while (zero < 32) {
                        System.out.print(0);
                        zero++;
                    }
                    System.out.print(Integer.toBinaryString(a << 1) + "\n");
                } else {
                    System.out.println(Integer.toBinaryString(a << 1));
                }
                a = a << 1;
                i++;
            }
        } else {
            System.out.println("Столько раз мигнуть не получится");
        }
    }

    public static void garland3(int a) {
        int b;
        b = a & 1;
        if (b == 1) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая лампочка не горит");
        }
    }

    public static void garland4(int a) {
        int zero;
        zero = Integer.toBinaryString(a).length();
        if (zero < 32) {
            while (zero < 32) {
                System.out.print(0);
                zero++;
            }
            System.out.print(Integer.toBinaryString(a) + "\n");
        } else {
            System.out.println(Integer.toBinaryString(a));
        }
    }

    public static void main(String[] args) {
        int b, num = 87381;
        while (true) {
            System.out.println("\nЧто вы хотели бы сделать с гирляндой?");
            System.out.println("1 - Мигание");
            System.out.println("2 - Бегущая строка");
            System.out.println("3 - Узнать, работает ли первая лампочка");
            System.out.println("4 - Просто посмотреть");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                if ((b == 1) || (b == 2) || (b == 3) || (b == 4)) {
                    switch (b) {
                        case 1:
                            garland1(num);
                            break;
                        case 2:
                            garland2(num);
                            break;
                        case 3:
                            garland3(num);
                            break;
                        case 4:
                            garland4(num);
                            break;
                    }
                } else {
                    System.out.println("Такого варианта нет");
                    System.out.print("\n");
                }
            } else {
                System.out.println("Такого варианта нет");
                System.out.print("\n");
            }
        }
    }
}