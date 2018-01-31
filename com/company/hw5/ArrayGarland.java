package com.company.hw5;

import com.company.MethodsForWork;
import java.util.Arrays;

public class ArrayGarland {
    private static int getBlinks() {
        int m;
        System.out.println("Сколько раз мигнуть гирлянде?");
        m = MethodsForWork.checkInt();
        return m;
    }

    private static void blink(int a, int m) {
        int i = 0;
        String[] arr = Integer.toBinaryString(a).split("");
        while (i < m) {
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
    }

    private static void run(int a, int m) {
        int i = 0;
        String[] arr = Integer.toBinaryString(a).split("");
        String[] dst = new String[arr.length];
        System.out.println(Arrays.deepToString(arr));
        while (i < m) {
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
        int b, m, num = 64513;
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
                    run(num, m);
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