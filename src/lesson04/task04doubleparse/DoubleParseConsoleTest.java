package lesson04.task04doubleparse;

public class DoubleParseConsoleTest {
    public static void main(String[] args) {
        double sum = 0;
        for (String str : args) {
            sum += Double.parseDouble(str);
        }
        System.out.println(sum / args.length);
    }
}
