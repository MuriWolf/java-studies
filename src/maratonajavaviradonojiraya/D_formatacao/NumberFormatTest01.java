package maratonajavaviradonojiraya.D_formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) throws ParseException {
        Locale localeJP = new Locale("ja", "JP");
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(localeJP);

        String value = "￥1,000";
        double valueNumber = 1000.22;
        System.out.println(nf1.format(valueNumber));

        System.out.println(nf1.parse(value));
    }
}
