package estudos.M_streams.test;

/*
    NOTAS AULA 206 - Flatmap

    Flatmap funciona de maneira semelhante ao map, entretanto, nesse método, estruturas aninhadas são colocadas na primeira
    camada

* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> enterprise = new ArrayList<>();

        List<String> developers = List.of("Murillo Pinheiro", "Lucas Spila", "Rafael");
        List<String> designers = List.of("John", "Bernard");
        List<String> humanResourses = List.of("July", "Askaye", "Mortrid");

        enterprise.add(developers);
        enterprise.add(designers);
        enterprise.add(humanResourses);

                                 // l -> l.stream()
        enterprise.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
