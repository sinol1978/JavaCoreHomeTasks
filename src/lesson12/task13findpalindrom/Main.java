package lesson12.task13findpalindrom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        findWords(string);
    }

    public static void findWords(String string) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            if (matcher.group().equalsIgnoreCase((new StringBuilder(matcher.group()).reverse()).toString())) {
                System.out.println(matcher.group());
            }
        }
    }
}
