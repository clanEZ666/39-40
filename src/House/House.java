package House;

import java.util.Objects;

public class House {
    private final int floors;
    private final int rooms;
    private final boolean garage;


    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.garage = builder.garage;

    }

    public String isGarage() {
        return garage ? "Да" : "Нет";
    }

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public void infoHouse() {
        System.out.println("Этажи: " + floors);
        System.out.println("Комнаты: " + rooms);
        System.out.println("Есть ли гараж: " + isGarage());
    }

    //Родительский класс
    public static class HouseBuilder {
        private int floors = 1;
        private int rooms = 1;
        private boolean garage = false;


        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }


        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            House house = (House) obj;
            return floors == house.floors &&
                    rooms == house.rooms &&
                    garage == house.garage;


        }

        @Override
        public int hashCode() {
            return Objects.hash(floors, rooms, garage);
        }


    }
}