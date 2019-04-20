package lesson16.task06heavyboxqueue.lesson16.task09students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Simmons", 1, "NA", 11);
        Student student2 = new Student("Redick", 2, "NA", 2);
        Student student3 = new Student("Embiid", 3, "NA", 12);
        Student student4 = new Student("Harris", 1, "NA", 1);
        Student student5 = new Student("Butler", 3, "NA", 9);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        printStudentLambda(students, 3);
        System.out.println("------------");
        printStudents(students, 3);
        System.out.println("------------");
        List<Student> goodStudents = deleteBadStudents(students);
        goodStudents.forEach(System.out::println);
    }

    private static List<Student> deleteBadStudents(List<Student> students) {
        List<Student> result = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getMark() > 3) {
                iterator.remove();
                temp.setCourse(temp.getCourse() + 1);
                result.add(temp);
            }
        }
        return result;
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student item : students) {
            if (item.getCourse() == course) {
                System.out.println(item);
            }
        }
    }

    private static void printStudentLambda(List<Student> students, int course) {
        Predicate<Student> predicate = s -> s.getCourse() == course;


    }
}
