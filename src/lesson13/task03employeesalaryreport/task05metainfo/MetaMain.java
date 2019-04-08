package lesson13.task03employeesalaryreport.task05metainfo;

import java.io.Serializable;

import lesson13.task03employeesalaryreport.task04holidays.Holiday;

import java.util.Arrays;

public class MetaMain {
    public static void main(String[] args) {
        printMetaInfo(Holiday.class);
    }

    public static void printMetaInfo(Class object) {
        System.out.println("Class: " + object.getName());
        System.out.println("Declared Constructors: " + Arrays.toString(object.getDeclaredConstructors()));
        System.out.println("Constructors: " + Arrays.toString(object.getConstructors()));

        System.out.println("Declared Methods: " + Arrays.toString(object.getDeclaredMethods()));
        System.out.println("Methods: " + Arrays.toString(object.getMethods()));

        System.out.println("Declared Fields: " + Arrays.toString(object.getDeclaredFields()));
        System.out.println("Fields: " + Arrays.toString(object.getFields()));
    }
}
