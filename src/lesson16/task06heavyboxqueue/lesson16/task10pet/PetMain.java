package lesson16.task06heavyboxqueue.lesson16.task10pet;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetMain {
    public static void main(String[] args) {
        Pet cat1 = new Cat("Kitty", "Black", 4.5);
        Pet cat2 = new Cat("Tom", "Red", 6.5);
        Pet dog1 = new Dog("Jerry", "Doberman", "Big");
        Pet dog2 = new Dog("Butch", "Bulldog", "Middle");
        Pet parrot1 = new Parrot("Birdy", "Green", 5);
        Pet parrot2 = new Parrot("Pirate", "Grey & Yellow", 3);
        Map<String, Pet> pets = new LinkedHashMap<>();
        pets.put(cat1.getName(), cat1);
        pets.put(cat2.getName(), cat2);
        pets.put(dog1.getName(), dog1);
        pets.put(dog2.getName(), dog2);
        pets.put(parrot1.getName(), parrot1);
        pets.put(parrot2.getName(), parrot2);
        printKeys(pets);
    }

    private static void printKeys(Map<String, Pet> pets) {
        pets.keySet().forEach(k -> System.out.println("Key: " + k));
    }
}
