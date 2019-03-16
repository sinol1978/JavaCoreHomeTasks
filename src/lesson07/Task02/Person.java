package lesson07.Task02;

public class Person {

    private String fullName;
    private int age;

    Person() {
    }

    Person(String name, int age) {
        fullName = name;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is speaking.");
    }
}
