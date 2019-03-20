package lesson04.task02minabs;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю
 * из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */

import java.util.Scanner;

public class MinAbsConsoleTest {
    public static void main(String[] args) {
        double x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first double number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("It's not an double!");
            System.out.print("Enter the first double number: ");
            sc.next();
        }
        x = sc.nextDouble();
        x = x < 0 ? -x : x;
        System.out.print("Enter the second double number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("It's not an double!");
            System.out.print("Enter the second double number: ");
            sc.next();
        }
        y = sc.nextDouble();
        y = y < 0 ? -y : y;
        System.out.print("Enter the third double number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("It's not an double!");
            System.out.print("Enter the third double number: ");
            sc.next();
        }
        z = sc.nextDouble();
        z = z < 0 ? -z : z;
        System.out.println("The absolute minimum is: " + getMin(x, y, z));
    }

    private static double getMin(double a, double b, double c) {
        double min = 0.0;
        if (a < b && a < c) {
            min = a;
        }
        if (b < a && b < c) {
            min = b;
        }
        if (c < a && c < b) {
            min = c;
        }
        return min;
    }
}

