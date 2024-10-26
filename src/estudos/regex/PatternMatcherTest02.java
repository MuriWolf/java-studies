package estudos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "0[xX][0-9A-Za-z]+";
        String texto = "0x 0X 0x67A 0X212";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: "+ texto);
        System.out.println("regex: "+ regex);
        while (matcher.find()) {
            System.out.println(matcher.start()+ " "+ matcher.group());
        }
    }
}
