package com.company.hw5;

import java.util.Arrays;

public class BubbleSorterReversedDemo {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSorterReversed.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
