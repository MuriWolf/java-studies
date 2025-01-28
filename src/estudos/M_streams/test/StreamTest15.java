package estudos.M_streams.test;

import estudos.M_streams.domain.Category;
import estudos.M_streams.domain.LightNovel;
import estudos.M_streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

/*
    NOTAS DA AULA 217 - Collectors pt 05 - Grouping by part 04

    Mais exemplos usando grouping by do colletors.
    É dito que usar collectors/grouping by pode ser um bom diferencial em entrevistas de emprego.
* */

public class StreamTest15 {
    private final static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:zero", 1.98, Category.FANTASY),
            new LightNovel("Kimetsu no Yaiba", 2.54, Category.FANTASY),
            new LightNovel("Hajime no Ippo", 1.99, Category.SPORTS),
            new LightNovel("Kenpuu Denki Berserk", 5.21, Category.FANTASY),
            new LightNovel("Darling no Franxx", 3.5, Category.ROMANCE),
            new LightNovel("Kimi no Katachi", 5.2, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.
                stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
