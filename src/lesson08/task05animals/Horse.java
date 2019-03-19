package lesson08.task05animals;

public class Horse extends Animal {
    private String name;
    private String color;

    public Horse() {
    }

    public Horse(String food, String location, String name, String color) {
        super(food, location);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "is whinnying!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "is eating the horse food.");
    }
}
