package estudos.I_colecoes.test;

import estudos.I_colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 32.4));

        Manga manga = new Manga(2L, "Re:zero", 32.4);

        Collections.sort(mangas);

        System.out.println(Collections.binarySearch(mangas, manga));
    }
}
