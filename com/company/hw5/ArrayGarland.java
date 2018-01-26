package com.company.hw5;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayGarland {
    private static void blink(int a) {
        int i = 0, b;
        String[] arr = Integer.toBinaryString(a).split("");
        System.out.println("Сколько раз мигнуть гирлянде?");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            while (i < b) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals("0")) {
                        arr[j] = "1";
                    } else {
                        arr[j] = "0";
                    }
                }
                System.out.println(Arrays.deepToString(arr));
                i++;
            }
        } else {
            System.out.println("Столько раз мигнуть не получится");
        }
    }

    private static void run(int a) {
        int i = 0, b;
        String[] arr = Integer.toBinaryString(a).split("");
        String[] dst = new String[arr.length];
        System.out.println("Сколько раз мигнуть гирлянде?");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            System.out.println(Arrays.deepToString(arr));
            while (i < b) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0) {
                        System.arraycopy(arr, j, dst, dst.length - 1, 1);
                        System.arraycopy(arr, j, arr, arr.length - 1, 1);
                    } else {
                        System.arraycopy(arr, j, dst, j - 1, 1);
                        System.arraycopy(arr, j, arr, j - 1, 1);
                    }
                }
                System.out.println(Arrays.deepToString(dst));
                i++;
            }

        } else {
            System.out.println("Столько раз мигнуть не получится");
        }
    }

    private static void checkFirstLamp(int a) {
        String[] arr = Integer.toBinaryString(a).split("");
        if (arr[0].equals("1")) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая лампочка не горит");
        }
    }

    private static void show(int a) {
        String[] arr = Integer.toBinaryString(a).split("");
        System.out.println(Arrays.deepToString(arr));

    }

    public static void main(String[] args) {
        int b, num = 64513;
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
                            blink(num);
                            break;
                        case 2:
                            run(num);
                            break;
                        case 3:
                            checkFirstLamp(num);
                            break;
                        case 4:
                            show(num);
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