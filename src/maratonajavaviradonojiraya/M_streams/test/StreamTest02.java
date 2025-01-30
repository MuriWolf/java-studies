package maratonajavaviradonojiraya.M_streams.test;

import maratonajavaviradonojiraya.M_streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    NOTAS AULA 204

    Mesmo desafio da aula anterior mas agora usando Streams de fato. Seu fluxo deve ser:
        1. Transformar a coleção em stream
        2. Fazer as operações necessárias (filtros, limites e etc)
        3. Reagrupar novamente em uma coleção

    No item 2, são usadas o que é chamado de operações intermediarias, ou seja, que não produzem um resultado final.
    Já no item 3, é usado uma função das chamdas operações finais, que dão o resultado final, como o nome indica.

* */

public class StreamTest02 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Re:zero", 1.98),
                new LightNovel("Kimetsu no Yaiba", 2.54),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));

        List<String> filteredLigthNovels = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() < 3)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList(); // na aula ele usa: collect(Collectors.toList())

        System.out.println(filteredLigthNovels);
    }
}
