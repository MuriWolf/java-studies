package estudos.C_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime datetimeNow = LocalDateTime.now();
        LocalDate date = LocalDate.of(1987, Month.SEPTEMBER, 23);
        LocalTime time = LocalTime.MIDNIGHT;

        LocalDateTime anotherDatetime = date.atTime(time);

        System.out.println(datetimeNow.getYear());
        System.out.println(datetimeNow);
        System.out.println(anotherDatetime);
    }
}
