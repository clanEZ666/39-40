package House;

public class Main {
    public static void main(String[] args) {

        House house1 = new House.HouseBuilder().setFloors(2).setRooms(5).setGarage(true).build();
        house1.infoHouse();

        House house2 = new House.HouseBuilder().setFloors(12).setRooms(45).setGarage(false).build();
        house2.infoHouse();
    }
}
