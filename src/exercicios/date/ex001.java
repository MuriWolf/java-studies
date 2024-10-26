package exercicios.date;


import java.time.LocalDate;
import java.util.Calendar;

public class ex001 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        LocalDate nowLocalDate = LocalDate.now();
        System.out.println(nowLocalDate);

    }
}
