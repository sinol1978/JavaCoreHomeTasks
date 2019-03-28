package lesson12.task04;

import java.util.Scanner;

/**
 * Даны строки разной длины (длина - четное число),
 * необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the string: ");
            String str = sc.nextLine();
            System.out.print(getMiddle(str) + "\n");
        }
    }

    private static String getMiddle(String str) {
        if (str.length() % 2 != 0) {
            return "The string length is not an even";
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}


