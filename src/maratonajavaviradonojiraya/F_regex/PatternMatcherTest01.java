package maratonajavaviradonojiraya.F_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "\\w";
        String texto = "$@2F1GHVDH@hjasdhj22";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: "+ texto);
        System.out.println("regex: "+ regex);
        while (matcher.find()) {
            System.out.println(matcher.start()+ " "+ matcher.group());
        }
    }
}
