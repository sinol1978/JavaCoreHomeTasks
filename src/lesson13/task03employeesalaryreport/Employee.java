package lesson13.task03employeesalaryreport;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;
    private LocalDate salaryDate;

    public Employee() {
    }

    public Employee(String fullName, double salary, LocalDate date) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = date;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return String.format("%-20s%10s", this.getFullName(), numberFormat.format(this.getSalary()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary);
    }
}
