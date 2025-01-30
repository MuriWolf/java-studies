package maratonajavaviradonojiraya.I_colecoes.test;

import maratonajavaviradonojiraya.I_colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone01 = new Smartphone("1DF3G", "Motorola");
        Smartphone smartphone02 = new Smartphone("1DF3G", "Ifhome");

        System.out.println(smartphone01.equals(smartphone02));
    }

}
