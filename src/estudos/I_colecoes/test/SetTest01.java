package estudos.I_colecoes.test;

import estudos.I_colecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {

        // treeSet usa o comparTo, não o equals
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 21D));
        mangas.add(new Manga(2L, "Re:zero", 4D));
        mangas.add(new Manga(3L, "Re:zero", 32.4));
        mangas.add(new Manga(3L, "Re:zero", 32.4));

        Manga rezero = new Manga(3L, "Re:zero", 21D);

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println(mangas.lower(rezero));
    }
}
