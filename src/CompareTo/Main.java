package CompareTo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Добавление объектов в список
        cars.add(new Car("Lada", 2024, "Black"));
        cars.add(new Car("Lada", 2024, "White"));
        cars.add(new Car("Lada", 2024, "Red"));
        cars.add(new Car("Lada", 2023, "Gray"));
        cars.add(new Car("Volga", 2024, "Black"));
        cars.add(new Car("Volga", 2023, "White"));
        cars.add(new Car("Volga", 2022, "Red"));
        cars.add(new Car("Audi", 2020, "Red"));


        cars.sort(new CarComparator());


        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
