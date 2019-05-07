package lesson12.task07employeesalaryreport;

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
        Report.saveSalaryReport(employees);
    }
}
