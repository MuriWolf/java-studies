package estudos.colecoes.test;

import estudos.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 32.4));
        mangas.add(new Manga(3L, "Re:zero", 32.4));
        mangas.add(new Manga(3L, "Re:zero", 32.4));
        mangas.add(new Manga(3L, "Re:zero", 32.4));

        System.out.println(mangas);
    }
}
