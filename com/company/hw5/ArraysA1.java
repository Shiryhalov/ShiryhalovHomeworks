package com.company.hw5;

public class ArraysA1 {
    public static void main(String[] args) {
        char a = 'a';
        String[][] example3 = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                example3[i][j] = a + "" + (j + 1);
            }
            a++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(example3[i][j] + " ");
            }
            System.out.println();
        }
    }
}