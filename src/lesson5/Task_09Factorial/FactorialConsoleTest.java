package lesson5.Task_09Factorial;

import java.util.Random;

/**
 * Реализовать подсчет факториала используя цикл for.
 * Число n задается случайным образом (используйте Math.random())
 */


public class FactorialConsoleTest {
    public static void main(String[] args) {
        int n = getRandomNumberInRange(0, 5);
        int f = 1;
        System.out.print(n + "! = ");
        if (n != 0) {
            for (int i = 1; i < n + 1; i++) {
                f *= i;
            }
        }
        System.out.print(f);
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
