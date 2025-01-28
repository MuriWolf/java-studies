package estudos.I_colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);

        nomes.add("Murillo");
        nomes.add("Ana");

        for (String nome: nomes) {
            System.out.println(nome);
        }
    }
}
