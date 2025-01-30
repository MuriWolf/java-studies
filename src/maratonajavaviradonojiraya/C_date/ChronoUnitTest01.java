package maratonajavaviradonojiraya.C_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 2, 14);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
    }
}
