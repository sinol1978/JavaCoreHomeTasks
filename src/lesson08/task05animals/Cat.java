package lesson08.task05animals;

public class Cat extends Animal {

    private String name;

    private int age;

    public Cat() {
    }

    public Cat(String food, String location, String name, int age) {
        super(food, location);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "is mewing!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "is eating the cat food.");
    }
}
