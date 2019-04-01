package lesson12.task07employeesalaryreport;

public class Report {
    public static void generateSalaryReport(Employee[] employees) {
        for (Employee item : employees) {
            System.out.println(item);
        }
    }
}
