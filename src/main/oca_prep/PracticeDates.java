package oca_prep;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PracticeDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019,02,04);
        LocalDate date2 = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Period period1 = Period.between(date1, date2);
        date1 = date1.plusMonths(20);

        try {
            System.exit(0);
        } finally {
            System.out.println("finally block");
        }
    }
}
