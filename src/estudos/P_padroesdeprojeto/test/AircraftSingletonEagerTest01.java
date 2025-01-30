package estudos.P_padroesdeprojeto.test;

import estudos.P_padroesdeprojeto.domain.Aircraft;
import estudos.P_padroesdeprojeto.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        // agora são o mesmo objeto, o que faz com que a segunda linha retorne false.
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}
