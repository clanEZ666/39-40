package CompareTo;


public class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car { " +
                "Модель = '" + model + '\'' +
                ", Год = " + year +
                ", Цвет = '" + color + '\'' +
                " }";
    }
}