package lesson14.task07matrixt;

import java.util.Arrays;

public class MatrixT<T extends Number> {
    private T[][] array;
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

    public MatrixT() {

    }

    public MatrixT(T[][] array) {
        setRows(array.length);
        setColumns(array[0].length);
        this.array = array;
    }

    public void printMatrixT() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public MatrixT<Double> plusMatrixT(MatrixT<T> matrixT) {
        if (this.rows == matrixT.rows && this.columns == matrixT.columns) {
            MatrixT result = new MatrixT(this.array);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    result.array[i][j] = this.array[i][j].doubleValue() + matrixT.array[i][j].doubleValue();
                }
            }
            return result;
        }
        return new MatrixT(this.array);
    }

    public MatrixT<Double> multNumber(int n) {
        MatrixT result = new MatrixT(this.array);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.array[i][j] = this.array[i][j].doubleValue() * n;
            }
        }
        return result;
    }

    public MatrixT multMatrixT(MatrixT matrixT) {
        if (this.rows == matrixT.rows && this.columns == matrixT.columns) {
            MatrixT<Double> result = new MatrixT(matrixT.array);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrixT.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result.array[i][j] += this.array[i][k].doubleValue() * matrixT.array[k][j].doubleValue();
                    }
                }
            }
            return result;
        }
        return new MatrixT(this.array);
    }
}
