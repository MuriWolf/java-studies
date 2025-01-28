package estudos.L_generics.services;

import java.util.List;

public class VehicleRentalService<T> {
    private final List<T> vehicleAvailables;

    public VehicleRentalService(List<T> vehiclesAvalaible) {
        this.vehicleAvailables = vehiclesAvalaible;
    }

    public T getAvailableVehicle() {
        System.out.println("Buscando veiculo disponivel");
        T t = this.vehicleAvailables.removeFirst();
        System.out.println("Alugando veiculo: " + t);
        this.showAvailableVehicles();
        return t;
    }

    public void returnVehicle(T t) {
        System.out.println("Return vehicle: " + t);
        this.vehicleAvailables.add(t);
    }

    public void showAvailableVehicles() {
        System.out.println("Available vehicles: " + this.vehicleAvailables);
    }
}
