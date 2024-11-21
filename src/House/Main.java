package House;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        House house1 = new House.HouseBuilder()
                .setFloors(2).
                setRooms(5).
                setGarage(true)
                .build();
        house1.infoHouse();

        House house2 = new House.HouseBuilder()
                .setFloors(12)
                .setRooms(45)
                .setGarage(false)
                .build();
        house2.infoHouse();

        House house3 = new House.HouseBuilder()
                .setFloors(5)
                .setRooms(4)
                .setGarage(true)
                .build();
        house3.infoHouse();

        House house4 = new House.HouseBuilder()
                .setFloors(7)
                .setRooms(7)
                .setGarage(false)
                .build();
        house4.infoHouse();


        //Дз 45-46

        ArrayList<House> houses = new ArrayList<House>();

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println("\nПроверка contains:");
        System.out.println("Содержится ли дом 1: " + houses.contains(house4));
        System.out.println("Содержится ли дом 2: " + houses.contains(house3));

        // Проверка позиции дома в списке
        System.out.println("\nПроверка indexOf:");
        System.out.println("Индекс дома 1: " + houses.indexOf(house2));
        System.out.println("Индекс дома 2: " + houses.indexOf(house3));

        // Проверка с изменением equals (убираем гараж из сравнения)
        System.out.println("Проверка с изменением equals: " + houses.equals(house2));


        // Проверка equals на наличие дома с гаражом и без гаража
        System.out.println("Содержится ли дом без учета гаража: " + houses.contains(house4));

    }

}
