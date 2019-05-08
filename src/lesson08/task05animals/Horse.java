package lesson08.task05animals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Horse extends Animal implements Serializable {
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

    public void save() {
        String path = "src/lesson08/task05animals/horse.ser";
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path))) {
            os.writeObject(this);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse load() {
        String path = "src/lesson08/task05animals/horse.ser";
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(path))) {
            Horse horse = (Horse) os.readObject();
            return horse;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("Horse %s, color: %s, location: %s, food: %s", name, color, super.getLocation(), super.getFood());
    }
}
