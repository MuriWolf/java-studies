package estudos.P_padroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

/*
    Alguns cuidados com multithreading e mal uso de outros programadores podem ser feitos.
    https://www.youtube.com/watch?v=9OvzSW1hAY0&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=250

* */

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("B1");
    }

    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null)  {
            INSTANCE = new AircraftSingletonLazy("BOING-704");
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
