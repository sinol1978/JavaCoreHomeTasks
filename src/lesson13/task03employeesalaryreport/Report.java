package lesson13.task03employeesalaryreport;

public class Report {
    public void generateSalaryReport(Employee[] employees) {
        for (Employee item : employees) {
            System.out.println(item);
        }
    }
}
