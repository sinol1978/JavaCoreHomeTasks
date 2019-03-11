package lesson07.Task02;

public class Person {
    String fullName;
    int age;

    Person(){
    }

    Person(String name, int age){
        fullName = name;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " is speaking.");
    }

    public void talk(){
        System.out.println(fullName + " is speaking.");
    }
}
