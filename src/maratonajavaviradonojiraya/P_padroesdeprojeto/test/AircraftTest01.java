package maratonajavaviradonojiraya.P_padroesdeprojeto.test;

import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        // sao objetos da mesma classe porém em diferentes espaços da memória
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("asdas");
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}
