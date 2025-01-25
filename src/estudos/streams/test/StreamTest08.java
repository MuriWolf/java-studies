package estudos.streams.test;

/*
    NOTAS AULA 2010 - Reduce pt 2

    Nesta aula foi apresentado algumas operações com stream de objetos.
*/

import estudos.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Re:zero", 7.98),
                new LightNovel("Kimetsu no Yaiba", 2.54),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Hajime no Ippo", 4.99),
                new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));

        // somar os precos
        lightNovels
                .stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // somas os preços usando o double primitivo (mais performace)
        double pricesSum = lightNovels
                .stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(pricesSum);
    }
}
