package lesson08.task05animals;

public class Dog extends Animal {

    private String name;
    private String kind;



    public Dog() {
    }

    public Dog(String food, String location, String name, String kind) {
        super(food, location);
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "is barking!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "is eating the dog food.");
    }
}
