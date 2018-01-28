package com.company.hw5;

public class ArraysMinMax {
    public static int[][] minMax(int[][] array) {
        int min, max;
        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            min = array[i][0];
            max = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= min) {
                    min = array[i][j];
                    result[i][0] = min;
                }
                if (array[i][j] >= max) {
                    max = array[i][j];
                    result[i][1] = max;
                }
            }

        }
        return result;
    }
}
