package maratonajavaviradonojiraya.M_streams.test;

/*
    NOTAS AULA 213 - Collectors pt 01 Summarizing

    Nessa aula foi apresentado o Collectors, com ele pode-se pegar sum, length, max e etc. Entretanto, o código ficou
    mais verboso usando eles, ao invés dos já usados antes. Seu brilho vem de fato com o summarizing e joining, o
    primeiro retorna todos esses dados citados e outros num objeto, enquanto o segundo faz um join de strings.
* */

import maratonajavaviradonojiraya.M_streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Re:zero", 7.98),
                new LightNovel("Kimetsu no Yaiba", 2.54),
                new LightNovel("Hajime no Ippo", 1.99),
                new LightNovel("Hajime no Ippo", 4.99),
                new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));

        DoubleSummaryStatistics statistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(statistics);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
