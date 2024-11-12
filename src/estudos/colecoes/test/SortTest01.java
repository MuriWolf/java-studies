package estudos.colecoes.test;

import estudos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByTitleComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga manga2) {
        return manga.getTitulo().compareTo(manga2.getTitulo());
    }
}

public class SortTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(145);
        numeros.add(83);
        numeros.add(91);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 32.4));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------");

       for (Manga manga : mangas) {
            System.out.println(manga);
       }

       Collections.sort(mangas, new MangaByTitleComparator());
       System.out.println("-------------");

       for (Manga manga : mangas) {
           System.out.println(manga);
       }
    }
}
