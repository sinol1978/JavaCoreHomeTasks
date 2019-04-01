package lesson12.task07employeesalaryreport;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа. Создать класс Report,
 * который будет содержать статический метод generateReport, в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматировании строк.
 * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Wall", 1500.1),
                new Employee("James Harden", 2500.1),
                new Employee("Jimmy Butler", 3500.1),
                new Employee("Kevin Durant", 4500.1),
                new Employee("Lebron James", 5500.1),
                new Employee("Chris Paul", 6500.1)
        };
        Report.generateSalaryReport(employees);
    }
}
