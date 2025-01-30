package maratonajavaviradonojiraya.I_colecoes.test;

import maratonajavaviradonojiraya.I_colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(0);
        numeros.add(21);
        numeros.add(54);
        numeros.add(0);
        numeros.add(0);
        numeros.add(67);

        Iterator<Integer> numerosIterator = numeros.iterator();
        while (numerosIterator.hasNext()) {
            Integer numero = numerosIterator.next();
            if (numero == 0) {
                numerosIterator.remove();
            }
        }

        System.out.println(numeros);

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(6L, "Bersek", 100D));
        mangas.add(new Manga(9L, "asadas", 0D));
        mangas.add(new Manga(1L, "Attack on titan", 33.3));
        mangas.add(new Manga(3L, "Re:zero", 32.4));
        mangas.add(new Manga(7L, "Pao", 0D));

        mangas.removeIf(manga -> manga.getValor() == 0);
        System.out.println(mangas);
    }
}
