package maratonajavaviradonojiraya.P_padroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

/*
    Joshua Bloch, Effective Java 2nd Edition p.18:
        A single-element enum type is the best way to implement a singleton
* */

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("A1");
        this.availableSeats.add("B1");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
