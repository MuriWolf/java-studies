package maratonajavaviradonojiraya.P_padroesdeprojeto.test;

import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        // agora são o mesmo objeto, o que faz com que a segunda linha retorne false.
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}
