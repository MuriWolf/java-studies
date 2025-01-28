package estudos.M_streams.test;

/*
    NOTAS AULA 218 - Streams pt 17 - Parallel Streams pt 01

    Nesta aula foi apresentado as parallel streams, que vão basicamente fazer com que o computador use multiplas threads
    para realizar um serviço. Basta adicionar um método parallel em qualquer lugar na stream para fazer funcionar.

    O multi-thread será muito útil em alguns casos, mas atrapalhará em outros. Em casos onde se sabe previamente o
    trabalho a ser feito, ele se sairá muito bem.
* */

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long size = 50_000_000;
        sumFor(size);
        sumStreamIterate(size);
        sumParallelStreamIterate(size);
        sumParallelLongStreamIterate(size);
    }

    private static void sumFor(Long num) {
        System.out.println("sum for");
        long result = 0;

        long init = System.currentTimeMillis();
        for (long i = 0L; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("sum stream iterate");

        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumParallelStreamIterate(Long num) {
        System.out.println("sum parallel stream iterate");

        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumParallelLongStreamIterate(Long num) {
        System.out.println("sum parallel long stream iterate");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
}
