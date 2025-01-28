package estudos.M_streams.test;

import estudos.M_streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    NOTAS AULA 203

    Streams servem para trabalhar com dados de forma declarativa, semelhante com banco de dados, por exemplo.

    Desafio (sem usar Streams, por enquanto):
        1. Orderne as light novels por titulo
        2. Filtre pelos 3 primeiras light novels onde seu preço é menor que 3.00. Retorne apenas os títulos.
* */

public class StreamTest01 {
    public static void main(String[] args) {
        ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:zero", 1.98),
            new LightNovel("Kimetsu no Yaiba", 2.54),
            new LightNovel("Hajime no Ippo", 1.99),
            new LightNovel("Kenpuu Denki Berserk", 1.21)
        ));

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        ArrayList<String> filteredLightNovels = new ArrayList<>();

         for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() < 3) {
               filteredLightNovels.add(lightNovel.getTitle());
            }

            if (filteredLightNovels.size() >= 3) {
                break;
            }
        }

        for (String filteredLightNovel : filteredLightNovels) {
            System.out.println(filteredLightNovel);
        }
    }
}
