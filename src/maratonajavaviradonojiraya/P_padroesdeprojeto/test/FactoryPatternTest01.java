package maratonajavaviradonojiraya.P_padroesdeprojeto.test;

/*
    NOTAS DA AULA 247 + outras fontes - Padrões de Projeto pt 02 - Factory

    Factory é um objeto cujo propósito é a criação de outros objetos. Uma função ou método que a partir de certo input,
    irá retornar variados objetos de classes.
    
    https://java-design-patterns.com/patterns/factory/#programmatic-example-of-factory-pattern-in-java
    Dentro do exemplo acima, é feito de maneira um pouco mais complexa.
* */

import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Material;
import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Sword;
import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.SwordFactory;

public class FactoryPatternTest01 {
    public static void main(String[] args) {
        Sword firstSword = SwordFactory.getSword(Material.STEEL);
        Sword secondSword = SwordFactory.getSword(Material.DIAMOND);

        System.out.println(firstSword.getMaterial());
        System.out.println(secondSword.getMaterial());
    }

}
