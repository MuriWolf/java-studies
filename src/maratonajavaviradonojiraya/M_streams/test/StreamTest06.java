package maratonajavaviradonojiraya.M_streams.test;

/*
    NOTAS AULA 207 - Finding and Matching

    Nesta aula foi apresentado algumas maneiras de procurar items num stream
* */

import maratonajavaviradonojiraya.M_streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Re:zero", 1.74),
                new LightNovel("Kimetsu no Yaiba", 2.54),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Hajime no Ippo", 5.83),
                new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));

        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 6));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() == 0));

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 2)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        // does the same thing:

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 2)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
