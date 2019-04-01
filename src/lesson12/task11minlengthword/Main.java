package lesson12.task11minlengthword;

import java.util.Arrays;

/**
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff"
 */

public class Main {
    public static void main(String[] args) {
        findMin("fffff ab f 1234 kjjj jkjk");

    }

    private static void findMin(String string) {
        String[] words = string.split("\\W+");
        for (String item : words) {
            int count = 0;
            for (int i = 0; i < item.length(); i++) {
                for (int j = 0; j < item.length() - 1; j++) {
                    if (item.toCharArray()[i] == item.toCharArray()[j]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(item + " " + count);
        }
    }
}
