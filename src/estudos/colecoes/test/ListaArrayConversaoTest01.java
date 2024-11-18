package estudos.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(33);
        numeros.add(21);
        numeros.add(54);

        // Um array criado a partir de um list array, não é criado uma conexão entre os dois, ou seja, a alteração em um não afeta o outro.
        Integer[] numerosArray = numeros.toArray(new Integer[0]);
        numerosArray[0] = 99;
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(numeros);

        // Já o contrario, ou seja, de array para lista, neste caso, afetar o list afeta o array. Isto ocorre pois o asList cria um wrapper sob o array
        List<Integer> numerosFromArray = Arrays.asList(numerosArray);
        numerosFromArray.set(0, 98);

        System.out.println(Arrays.toString(numerosArray));
    }
}
