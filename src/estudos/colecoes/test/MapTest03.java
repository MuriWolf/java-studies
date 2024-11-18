package estudos.colecoes.test;

import estudos.colecoes.dominio.Consumidor;
import estudos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Murillo Pinheiro Santana de Oliveira");
        Consumidor consumidor02 = new Consumidor("Joaquin Fenix");

        Manga bersek = new Manga(6L, "Bersek", 100D);
        Manga attackOnTitan = new Manga(1L, "Attack on titan", 33.3);
        Manga rezero = new Manga(3L, "Re:zero", 21D);

        Map<Consumidor, List<Manga>> compradores = new HashMap<>();

        List<Manga> listaConsumidor1 = List.of(rezero, bersek);
        List<Manga> listaConsumidor2 = List.of(attackOnTitan, bersek, rezero);

        compradores.put(consumidor01, listaConsumidor1);
        compradores.put(consumidor02, listaConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : compradores.entrySet()) {
            System.out.println("---"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------"+manga.getTitulo());
            }
        }

    }
}