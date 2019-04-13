package lesson07.task04bookreader;

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
    private String clientName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Reader(String name) {
        this.clientName = name;
    }

    public void takeBook(int bookQuantity) {
        String e;
        e = (bookQuantity == 1) ? "" : "s";
        System.out.println(this.clientName + " took " + bookQuantity + " book" + e);
    }

    public void returnBook(int bookQuantity) {
        String e;
        e = (bookQuantity == 1) ? "" : "s";
        System.out.println(this.clientName + " returned " + bookQuantity + " book" + e);
    }

    public void takeBook(Book... books) {
        System.out.println(this.clientName + " took:");
        int i = 0;
        for (Book book : books) {
            System.out.println("\t" + (++i) + "." + book.getName());
        }
    }

    public void returnBook(Book... books) {
        System.out.println(this.clientName + " returned:");
        int i = 0;
        for (Book book : books) {
            System.out.println("\t" + (++i) + "." + book.getName());
        }
    }
}
