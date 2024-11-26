package estudos.behavior.domain;

public class Car {
    private final String name = "Corsa";
    private final String brand;
    private final int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
