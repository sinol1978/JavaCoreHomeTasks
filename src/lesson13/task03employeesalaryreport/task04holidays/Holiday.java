package lesson13.task03employeesalaryreport.task04holidays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class Holiday {
    private LocalDate date;
    private String name;

    public Holiday(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.US);
        String string = this.date.format(formatter);
        return String.format("%20s - %-40s", string, this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holiday holiday = (Holiday) o;
        return Objects.equals(date, holiday.date) &&
                Objects.equals(name, holiday.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, name);
    }
}
