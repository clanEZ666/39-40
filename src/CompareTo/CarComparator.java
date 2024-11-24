package CompareTo;

import java.util.Comparator;


    public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {

        int modelComparison = car1.getModel().compareTo(car2.getModel());
        if (modelComparison != 0) {
            return modelComparison;
        }


        int yearComparison = Integer.compare(car2.getYear(), car1.getYear());
        if (yearComparison != 0) {
            return yearComparison;
        }


        return car1.getColor().compareTo(car2.getColor());
    }
}