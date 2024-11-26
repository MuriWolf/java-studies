package estudos.behavior.test;

import estudos.behavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Chevrolet", 2011),
                new Car("Vokesvagen", 2022),
                new Car("Chevrolet", 2003)
        );

        System.out.println(filterByBrand(cars, "Chevrolet"));
    }

    private static List<Car> filterByBrand(List<Car> cars, String brand) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
