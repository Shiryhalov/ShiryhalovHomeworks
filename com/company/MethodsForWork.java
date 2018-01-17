package com.company;

import java.util.Scanner;

public class MethodsForWork {
    public static int checkInt() {
        int i = 0, b = 0;
        while (i == 0) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                i++;
            } else {
                System.out.println("Введите целое число");
                i = 0;
            }
        }
        return b;
    }
}
