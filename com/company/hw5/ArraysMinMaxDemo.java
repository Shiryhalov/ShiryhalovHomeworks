package com.company.hw5;

import java.util.Arrays;

public class ArraysMinMaxDemo {
    public static void main(String[] args) {
        int[][] data = {
                {2, 8, 13, 6, 5, 7, 4, 3},
                {6, 8, 3, 115, 5, 4, 2, 8},
                {13, 8, 3, 123, 5, 4, 1, 5},
                {6, 295, 3, 14, 5, 4, 14, 64},
                {74, 8, 1, 44, 51, 43, 18, 17},
        };
        int[][] result = ArraysMinMax.minMax(data);

        System.out.println(Arrays.deepToString(data));
        System.out.println(Arrays.deepToString(result));
    }
}

