package estudos.K_behavior.test;

import estudos.K_behavior.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest02 {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Chevrolet", 2011),
                new Car("Vokesvagen", 2022),
                new Car("Chevrolet", 2003)
        );

        System.out.println(filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2010;
            }
        }));

        // mesmo que o de cima, mas usando lambdas
        System.out.println(filter(cars, car -> car.getBrand().equals("Chevrolet")));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T t : list) {
           if (predicate.test(t)) {
               filteredList.add(t);
           }
        }

        return filteredList;
    }

}
