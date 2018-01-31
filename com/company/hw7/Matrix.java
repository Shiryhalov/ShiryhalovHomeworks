package com.company.hw7;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private int[][] array;
    private int rows;
    private int columns;

    public Matrix(int[][] array) {
        setArray(array);
    }

    public Matrix() {
    }

    public int[][] getArray() {
        return array.clone();
    }

    public void setArray(int[][] array) {
        this.array = array.clone();
        this.rows = array.length;
        this.columns = array[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void print() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getArray()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix summ(Matrix secMatrix) {
        Matrix summ = new Matrix(new int[array.length][array[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += secMatrix.getArray()[i][j];
            }
        }
        summ.setArray(array);
        return summ;
    }

    public Matrix multMatrix(Matrix secMatrix) {
        int[][] secArray = secMatrix.getArray();
        int[][] compArray = new int[array.length][secArray[0].length];
        Matrix comp = new Matrix(new int[array.length][secArray[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < secArray[0].length; j++) {
                for (int k = 0; k < secArray.length; k++) {
                    compArray[i][j] += array[i][k] * secArray[k][j];
                }
            }
        }
        comp.setArray(compArray);
        return comp;
    }

    public Matrix multNumber(int number) {
        Matrix summ = new Matrix(new int[array.length][array[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= number;
            }
        }
        summ.setArray(array);
        return summ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rows == matrix.rows &&
                columns == matrix.columns &&
                Arrays.equals(array, matrix.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(rows, columns);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
