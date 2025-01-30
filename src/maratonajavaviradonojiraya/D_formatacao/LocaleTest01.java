package maratonajavaviradonojiraya.D_formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locateItaly = new Locale("it", "IT");
        Locale localeJapan = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locateItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("JaPÃO: " + df2.format(calendar.getTime()));
    }
}
