package lesson13.task03employeesalaryreport;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Добавить переменную LocalDate salaryDate в класс Employee из предыдущего урока.
 * Создать класс FullReport, который выводит ту же информацию, что и Report из предыдущего урока, и добавляет дату выдачи зарплаты.
 * Использовать класс NumberFormat. Заголовок отчета должен изменяться в зависимости от выбранной локали (используем класс ResourceBundle).
 */

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Wall", 1500.1, LocalDate.now()),
                new Employee("James Harden", 2500.1, LocalDate.now()),
                new Employee("Jimmy Butler", 3500.1, LocalDate.now()),
                new Employee("Kevin Durant", 4500.1, LocalDate.now()),
                new Employee("Lebron James", 5500.1, LocalDate.now()),
                new Employee("Chris Paul", 6500.1, LocalDate.now())
        };
        Report r1 = new Report();
        Report r2 = new FullReport();
        r1.generateSalaryReport(employees);
        r2.generateSalaryReport(employees);
    }
}
