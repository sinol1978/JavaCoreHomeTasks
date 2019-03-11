package lesson07.Task02;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Smith", 27);
        person1.move();
        person2.talk();
    }
}
