package maratonajavaviradonojiraya.C_date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.now().plusWeeks(29);
        Period p1 = Period.between(now, then);
        Period p2 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);
    }
}
