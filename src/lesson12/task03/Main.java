package lesson12.task03;

/**
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
 * Например строка "Object-oriented programming is a programming language model organized
 * around objects rather than "actions" and data rather than logic. Object-oriented programming blabla.
 * Object-oriented programming bla."
 * должна быть преобразована в "Object-oriented programming is a programming language model organized
 * around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
 */

public class Main {
    public static void main(String[] args) {
        String string = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(string);
        System.out.println("\n");
        System.out.println(reverseOOP(string));

    }

    private static StringBuilder reverseOOP(StringBuilder stringBuilder) {

        return stringBuilder;
    }

    private static String reverseOOP(String string) {

        return string.replace("Object-oriented programming", "OOP");

    }

}
