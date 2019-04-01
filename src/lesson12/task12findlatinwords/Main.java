package lesson12.task12findlatinwords;

import java.util.Arrays;
import java.util.regex.*;

/**
 * Предложение состоит из нескольких слов, разделенных пробелами.
 * Например: "One two three раз два три one1 two2 123 ".
 * Найти количество слов, содержащих только символы латинского алфавита.
 */

public class Main {
    public static void main(String[] args) {
        String string = "One two three раз два три one1 two2 123 ";
        findWords(string);
    }

    public static void findWords(String string) {
        int count = 0;
        Pattern pattern = Pattern.compile("[A-za-z]+\\s");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
