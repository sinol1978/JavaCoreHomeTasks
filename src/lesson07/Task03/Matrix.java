package lesson07.Task03;

import java.util.Random;
import java.util.Scanner;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать;
 * 4) умножение матриц - по желанию.
 */
public class Matrix {

    private double[][] array;
    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Matrix() {

    }

    public Matrix(int rows, int columns) {
        setRows(rows);
        setColumns(columns);
        array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (double) Math.round(Math.random() * 10000) / 100;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix plusMatrix(Matrix matrix) {
        if (this.rows == matrix.rows && this.columns == matrix.columns) {
            Matrix result = new Matrix(this.rows, this.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    result.array[i][j] = this.array[i][j] + matrix.array[i][j];
                }
            }
            return result;
        }
        return new Matrix(0, 0);
    }

    public Matrix multNumber(int n) {
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.array[i][j] = this.array[i][j] * (double) n;
            }
        }
        return result;
    }

    public Matrix multMatrix(Matrix matrix) {
        if (this.rows == matrix.rows && this.columns == matrix.columns) {
            Matrix result = new Matrix(this.rows, this.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result.array[i][j] += this.array[i][k] * matrix.array[k][j];
                    }
                }
            }
            return result;
        }
        return new Matrix(0, 0);
    }
}
