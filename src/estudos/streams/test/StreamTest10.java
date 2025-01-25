package estudos.streams.test;

/*
    NOTAS AULA 212 - Gerando Streams pt 2
*/

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        // faça a sequencia de fibonacci usando o stream iterate
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(n -> System.out.println(n[1]));

        // gere números aleatórios usando o stream generate
        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 2024))
                .limit(50)
                .forEach(System.out::println);

    }
}
