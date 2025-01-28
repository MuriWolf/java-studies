package estudos.M_streams.test;

import estudos.M_streams.domain.Category;
import estudos.M_streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    NOTAS DA AULA 214 - Collectors pt 02 - grouping by

    Grouping by pode tirar muito trabalho. De maneira semelhante ao group by do PostgreSQL, ele vai agrupar os items
    de um array baseado num valor comum.
* */

public class StreamTest12 {
    private final static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:zero", 1.98, Category.FANTASY),
            new LightNovel("Kimetsu no Yaiba", 2.54, Category.FANTASY),
            new LightNovel("Hajime no Ippo", 1.99, Category.SPORTS),
            new LightNovel("Kenpuu Denki Berserk", 1.21, Category.FANTASY),
            new LightNovel("Darling no Fraxx", 3.5, Category.ROMANCE),
            new LightNovel("Kimi no Katachi", 5.2, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> lightNovelsByCategory = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(lightNovelsByCategory);
    }
}
