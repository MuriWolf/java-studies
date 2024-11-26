package estudos.internals;

import estudos.generics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Mercedes"), new Car("Fusca"), new Car("BMW")));

        System.out.println(cars);
        cars.sort((car, car2) -> car.getName().compareTo(car2.getName()));

//        cars.sort(new Comparator<Car>() {
//            @Override
//            public int compare(Car car, Car car2) {
//                return car.getName().compareTo(car2.getName());
//            }
//        });
        System.out.println(cars);
    }
}
