package lesson04.task01evenorodd;

import java.util.Scanner;

public class EvenOrOddConsoleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        while (!sc.hasNextInt()) {
            System.out.println("It's not an integer!");
            System.out.print("Enter the integer number: ");
            sc.next();
        }
        if (getCompareResult(sc.nextInt())) {
            System.out.println("your number is even!");
        } else {
            System.out.println("your number is odd!");
        }
    }

    private static boolean getCompareResult(int i) {
        return i % 2 == 0;
    }
}
