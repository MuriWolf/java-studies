package estudos.date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalTime localtime01 = LocalTime.now();
        LocalTime beforeLocaltime01 = localtime01.minusHours(7).minusMinutes(22);

        Duration d1 = Duration.between(localtime01, beforeLocaltime01);
        Duration d2 = Duration.ofDays(365);
        Duration d3 = Duration.of(21, ChronoUnit.HOURS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
