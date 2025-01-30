package estudos.P_padroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("B1");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
