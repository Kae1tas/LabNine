public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        Apartment Apartment1= new Apartment("Wood", "Yellow", 30);
        Office Office1 = new Office("concrete", "white", 40);
        myHouse.addRoom(Apartment1);
        myHouse.addRoom(Office1);
        myHouse.addRoom(new Apartment("linoleum", "gray", 25));

        myHouse.printHouse();
        myHouse.amountOfRooms();
        if (myHouse.findRoom(Apartment1)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}
