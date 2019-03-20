package lesson04.task04doubleparse;

/**
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class DoubleParseConsoleTest {
    public static void main(String[] args) {
        double sum = 0;
        for (String str : args) {
            sum += Double.parseDouble(str);
        }
        System.out.println(sum / args.length);
    }
}
