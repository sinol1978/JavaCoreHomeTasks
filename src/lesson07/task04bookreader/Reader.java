package lesson07.task04bookreader;

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
