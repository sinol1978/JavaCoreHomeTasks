package lesson07.Task04;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader("John Smith");
        r.takeBook(1);

        Book b1 = new Book("Cook Book", "Hannibal Lector");
        Book b2 = new Book("Pattern MVC", "Vitaliy Klichko");

        Book[] books = new Book[2];
        books[0] = b1;
        books[1] = b2;

        r.takeBook(books);

        r.returnBook(2);

        r.returnBook(books);
    }
}
