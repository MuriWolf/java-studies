package maratonajavaviradonojiraya.M_streams.test;

/*
    NOTAS AULA 209 - Reduce pt 1

    Nessa aula foi apresentado o método reduce, que, à partir de uma lista de items, retorna apenas um (tem no JS).
    Aqui foi trabalhado apenas com números.
    Repare que devido à possibilidade da lista estar vazia, o reduce retorna um optional.
* */

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(7,1,2,3,4,5,6);

        // soma dos inteiros
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        // multiplicacao dos inteiros
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        // maior valores dos inteiros
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
