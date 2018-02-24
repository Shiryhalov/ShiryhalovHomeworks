package com.company.hw15;

import java.util.Arrays;
import java.util.Objects;

public class MatrixGeneric<T extends Number> {
    private T[][] array;
    private int rows;
    private int columns;

    public MatrixGeneric(T[][] array) {
        setArray(array);
    }

    public MatrixGeneric() {
    }

    public T[][] getArray() {
        return array.clone();
    }

    public void setArray(T[][] array) {
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

    public MatrixGeneric<Double> summ(MatrixGeneric<?> secMatrix) {
        MatrixGeneric<Double> summ = new MatrixGeneric<>(new Double[array.length][array[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ.array[i][j] = array[i][j].doubleValue() + secMatrix.getArray()[i][j].doubleValue();
            }
        }
        return summ;
    }

    public MatrixGeneric<Double> multMatrix(MatrixGeneric<?> secMatrix) {
        MatrixGeneric<Double> comp = new MatrixGeneric<>(new Double[array.length][secMatrix.getArray()[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < secMatrix.getArray()[0].length; j++) {
                comp.array[i][j] = 0.0;
                for (int k = 0; k < secMatrix.getArray().length; k++) {
                    comp.array[i][j] += array[i][k].doubleValue() *
                            secMatrix.getArray()[k][j].doubleValue();
                }
            }
        }
        return comp;
    }

    public MatrixGeneric<Double> multNumber(int number) {
        MatrixGeneric<Double> summ = new MatrixGeneric<>(new Double[array.length][array[0].length]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ.array[i][j] = array[i][j].doubleValue() * number;
            }
        }
        return summ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatrixGeneric matrix = (MatrixGeneric) o;
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
