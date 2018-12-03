package com.company.testTasks.countTheFigures;

public class CountTheFigures {
    static void countTheFigures(int[][] array, int x, int y, int counter) {
        if (x < array.length - 1) {
            if (array[x + 1][y] == 1) {
                array[x + 1][y] = counter;
                countTheFigures(array, x + 1, y, counter);
            }
        }
        if (y < array[x].length - 1) {
            if (array[x][y + 1] == 1) {
                array[x][y + 1] = counter;
                countTheFigures(array, x, y + 1, counter);
            }
        }
        if (x > 0) {
            if (array[x - 1][y] == 1) {
                array[x - 1][y] = counter;
                countTheFigures(array, x - 1, y, counter);
            }
        }
        if (y > 0) {
            if (array[x][y - 1] == 1) {
                array[x][y - 1] = counter;
                countTheFigures(array, x, y - 1, counter);
            }
        }
    }
}

