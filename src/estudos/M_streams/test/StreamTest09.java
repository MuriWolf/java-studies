package estudos.M_streams.test;

/*
    NOTAS AULA 211 - Gerando Streams pt 1

    Aqui foi apresentado como gerar streams sem depender de outros objetos ou listas.
    Tanto de int, string e files.

    rangeClosed x range: o rangeClosed vai criar uma lista até o último número especificado. Já o range irá criar do
    primeiro até o penúltimo.
        Ex: rangeClosed(1, 30) = 1 ... 30
        Ex: range(1, 30) = 1 ... 29
* */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        // print all odds in a stream of integers
        IntStream.rangeClosed(1, 50).filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));

        System.out.println();
        Stream.of("Matamos " , "o ", "tempo, ", "o ", "tempo ", "nos ", "enterra.")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();
        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("file2.txt"))) {
            lines
                    .filter(l -> l.toLowerCase().contains("java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
