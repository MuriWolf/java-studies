package estudos.formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");

        NumberFormat nf1 = NumberFormat.getInstance(localeJP);
        NumberFormat nf2 = NumberFormat.getInstance(localeBR);

        double value = 1_500_222.21;

        System.out.println(nf1.format(value));
        System.out.println(nf2.format(value));
    }
}
