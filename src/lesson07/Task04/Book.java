package lesson07.Task04;

public class Book {
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
    public Book(String name, String author){
        setName(name);
        setAuthor(author);
    }
}
