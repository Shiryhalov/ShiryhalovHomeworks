package com.company.testTasks.countTheFigures;

public class Main {
    public static void main(String[] args) {
        int counter = 2;
        int array[][] = {
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 1, 1, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    array[i][j] = counter;
                    CountTheFigures.countTheFigures(array, i, j, counter);
                    counter++;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        counter = counter - 2;
        System.out.println("Фигур в двумерном массиве: " + counter);
    }
}
