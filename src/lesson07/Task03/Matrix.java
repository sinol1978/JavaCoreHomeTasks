package lesson07.Task03;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

    private double[][] array;
    private int rows;
    private int columns;

    public Matrix() {

    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new double[rows][columns];
        for(int i = 0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j] = Math.random()*100;
            }
        }
    }

    public void getMatrix(){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
