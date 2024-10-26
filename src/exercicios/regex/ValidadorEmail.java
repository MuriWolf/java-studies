package exercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorEmail {
    public static void main(String[] args) {
        String texto = "joao.silva@email.com, maria_clara@email.com, contato@empresa.com.br, teste123@dominio.org, usuario+teste@exemplo.com, suporte@dominio-co.com, admin@webpage.net, newsletter@email.info, usuario@dominio\n";
        String regex = "([a-zA-Z0-9\\.+-_])+@([a-zA-Z-_])+(\\.([a-zA-Z])+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
