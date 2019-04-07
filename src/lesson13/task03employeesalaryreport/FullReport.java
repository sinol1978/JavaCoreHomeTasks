package lesson13.task03employeesalaryreport;

import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport extends Report {
    public void generateSalaryReport(Employee[] employees) {
        Locale current = new Locale("ru", "RU");
        ResourceBundle rb = ResourceBundle.getBundle("caption", current);
        System.out.println(String.format("%-20s%10s%15s", rb.getString("name"), rb.getString("salary"), rb.getString("date")));
        System.out.println("---------------------------------------------");
        for (Employee item : employees) {
            System.out.println(item + "     " + item.getSalaryDate());
        }
    }
}
