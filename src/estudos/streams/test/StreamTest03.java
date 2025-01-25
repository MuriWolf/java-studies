package estudos.streams.test;

import estudos.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    NOTAS AULA 205

    Nesta aula foram demonstrados algumas operações tanto finais quanto intermediarias.

    O código abaixo é considerado má prática, pois há um gasto desnecessário de recursos,
    o lightNovels sendo um ArrayList, já possui o forEach:
        lightNovels.stream().forEach(System.out::println);
        
    Uma stream depois de fechada, já não pode ser mexida (com operações intermediarias, por exemplo),
    mas é raro estar nessa situação.
*/


public class StreamTest03 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Re:zero", 1.98),
                new LightNovel("Kimetsu no Yaiba", 2.54),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));
        Stream<LightNovel> stream = lightNovels.stream();

        List<String> filteredLightNovels = stream
                .distinct() // a classe necessita ter o equals e hashcode implementadas para funcionar corretamente
                .filter(ln -> ln.getPrice() < 4)
                .map(LightNovel::getTitle)
                .toList();

        System.out.println(filteredLightNovels);
    }
}
