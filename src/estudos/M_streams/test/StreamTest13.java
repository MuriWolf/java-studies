package estudos.M_streams.test;

import estudos.M_streams.domain.Category;
import estudos.M_streams.domain.LightNovel;
import estudos.M_streams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    NOTAS DA AULA 215 - Collectors pt 3 - Grouping by pt 2

    Aqui é usado também o grouping by, mas agora com uma lógica um pouco diferente. No segundo exemplo, é demonstrado
    que é possível um group by dentro de outro, nesse caso é possível também ver que fica muito complexo, deixar essa
    coleta para o banco de dados pode ser a melhor opção, ao invés do Java, mas vai depender do caso.
* */

public class StreamTest13 {
    private final static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:zero", 1.98, Category.FANTASY),
            new LightNovel("Kimetsu no Yaiba", 2.54, Category.FANTASY),
            new LightNovel("Hajime no Ippo", 1.99, Category.SPORTS),
            new LightNovel("Kenpuu Denki Berserk", 5.21, Category.FANTASY),
            new LightNovel("Darling no Franxx", 3.5, Category.ROMANCE),
            new LightNovel("Kimi no Katachi", 5.2, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(collect);

        // lista de promocoes de lightnovel organizada por categoria: map<category, map<promotion, list<lightnovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);

    }


}
