package lesson12.task07employeesalaryreport;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Report {
    public static void generateSalaryReport(Employee[] employees) {
        for (Employee item : employees) {
            System.out.println(item);
        }
    }

    public static void saveSalaryReport(Employee[] employees) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salaryReport.txt"))) {
            for (Employee item : employees) {
                bw.write(item.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
