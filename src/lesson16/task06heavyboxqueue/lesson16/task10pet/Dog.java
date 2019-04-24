package lesson16.task06heavyboxqueue.lesson16.task10pet;

import java.util.Objects;

public class Dog extends Pet {
    private String breed;
    private String size;

    public Dog(String name, String breed, String size) {
        super(name);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) &&
                Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, size);
    }
}
