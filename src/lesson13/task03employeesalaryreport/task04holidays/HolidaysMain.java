package lesson13.task03employeesalaryreport.task04holidays;

import java.time.LocalDate;

public class HolidaysMain {
    public static void main(String[] args) {
        Holiday[] holidays = {
                new Holiday(LocalDate.of(2019, 1, 1), "New Year"),
                new Holiday(LocalDate.of(2019, 2, 14), "Valentine's Day"),
                new Holiday(LocalDate.of(2019, 3, 8), "Women's Day"),
                new Holiday(LocalDate.of(2019, 4, 28), "Easter Day"),
                new Holiday(LocalDate.of(2019, 6, 28), "Ukrainian Constitution Day"),
                new Holiday(LocalDate.of(2019, 8, 24), "Ukrainian Independence Day"),
                new Holiday(LocalDate.of(2019, 12, 25), "Xmas Day")
        };
        for (Holiday item : holidays) {
            System.out.println(item);
        }
    }
}
