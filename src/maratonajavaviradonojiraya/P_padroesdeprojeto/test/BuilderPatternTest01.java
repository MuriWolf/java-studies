package maratonajavaviradonojiraya.P_padroesdeprojeto.test;

/*
    NOTAS DA AULA 246 - padroes de projeto pt 01 - builder

    Padrões de projeto são úteis para situações específicas e que são feitas repetidas vezes, cada uma terá uma função
    e local apropriado de uso.

    O pattern builder é útil para casos onde a classe tem muitas propriedades e pode haver confusão com os nomes.
    No Intellij tem um plugin para criar builder automaticamente.
* */

import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person pessoa01 = new Person.PersonBuilder()
                .firstName("Murillo")
                .lastName("Pinheiro")
                .username("MuriWolf")
                .email("murillop.o06@gmail.com")
                .build();

        System.out.println(pessoa01);
    }
}
