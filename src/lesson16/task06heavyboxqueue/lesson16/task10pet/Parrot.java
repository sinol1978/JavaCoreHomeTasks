package lesson16.task06heavyboxqueue.lesson16.task10pet;

import java.util.Objects;

public class Parrot extends Pet {
    private String color;
    private int age;

    public Parrot(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age &&
                Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}
