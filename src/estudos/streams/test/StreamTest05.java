package estudos.streams.test;

/*
    NOTAS AULA 207 - Flatmap 2

    Mais exemplos usando coisas aninhadas, neste caso strings dentro de um array (strings são uma lista de caracteres)
* */

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Hey!", "wait!", "I've", "got", "a", "new", "complaint");

        List<String> list = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(list);
    }
}