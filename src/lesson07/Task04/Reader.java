package lesson07.Task04;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг.
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book
 * (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook().
 * Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
 * Или  "Петров В. В. вернул 3 книги".
 */

public class Reader {
    String clientName;
    int cardNumber;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    Reader(String name) {
        this.clientName = name;
    }

    void takeBook(int bookQuantity) {
        String e;
        e = (bookQuantity == 1) ? "" : "s";
        System.out.println(this.clientName + " took " + bookQuantity + " book" + e);
    }

    void returnBook(int bookQuantity) {
        String e;
        e = (bookQuantity == 1) ? "" : "s";
        System.out.println(this.clientName + " returned " + bookQuantity + " book" + e);
    }

    void takeBook(Book[] books) {
        System.out.println(this.clientName + " took:");
        int i = 0;
        for (Book book : books) {
            System.out.println("\t" + (++i) + "." + book.getName());
        }
    }

    void returnBook(Book[] books) {
        System.out.println(this.clientName + " return:");
        int i = 0;
        for (Book book : books) {
            System.out.println("\t" + (++i) + "." + book.getName());
        }
    }


}
