package lesson07.Task03;

public class MainApp {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        Matrix matrix3 = matrix1.plusMatrix(matrix2);
        matrix1.printMatrix();
        System.out.println("---------");
        matrix2.printMatrix();
        System.out.println("---------");
        matrix3.printMatrix();
        System.out.println("---------");
        Matrix matrix4 = matrix1.multNumber(2);
        matrix4.printMatrix();
        System.out.println("---------");
        Matrix matrix5 = matrix1.multMatrix(matrix2);
        matrix5.printMatrix();
    }
}
