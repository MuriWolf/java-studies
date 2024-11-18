package estudos.colecoes.test;

import estudos.colecoes.dominio.Consumidor;
import estudos.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Murillo Pinheiro Santana de Oliveira");
        Consumidor consumidor02 = new Consumidor("Joaquin Fenix");

        Manga bersek = new Manga(6L, "Bersek", 100D);
        Manga attackOnTitan = new Manga(1L, "Attack on titan", 33.3);
        Manga rezero = new Manga(3L, "Re:zero", 21D);

        Map<Consumidor, Manga> compradores = new HashMap<>();

        compradores.put(consumidor01, bersek);
        compradores.put(consumidor02, attackOnTitan);

        for (Map.Entry<Consumidor, Manga> entry : compradores.entrySet()) {
            System.out.printf("comprador: %s, manga: %s%n", entry.getKey().getNome(), entry.getValue().getTitulo());
        }

    }
}
