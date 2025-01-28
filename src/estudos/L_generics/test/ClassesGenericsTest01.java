package estudos.L_generics.test;

import estudos.L_generics.domain.Boat;
import estudos.L_generics.domain.Car;
import estudos.L_generics.services.VehicleRentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericsTest01 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca"), new Car("Mercedes")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Canoa"), new Boat("Caravela"), new Boat("Navio")));

        VehicleRentalService<Boat> rentalService = new VehicleRentalService<>(availableBoats);

        Boat availableVehicle = rentalService.getAvailableVehicle();
        rentalService.returnVehicle(availableVehicle);
        rentalService.showAvailableVehicles();
    }
}
