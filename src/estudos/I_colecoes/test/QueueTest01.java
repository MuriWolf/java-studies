package estudos.I_colecoes.test;

import estudos.I_colecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MangaComparatorByValor implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga manga2) {
        return Double.compare(manga.getValor(), manga2.getValor());
    }
}

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaComparatorByValor().reversed());

        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 21D));

        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
