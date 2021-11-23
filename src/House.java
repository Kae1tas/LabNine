import Example.Auto;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> arrRoom = new ArrayList<Room>();
    public void addRoom(Room m){
        arrRoom.add(m);
    }
    public House(){
    }
    public Boolean findRoom(Room m){
        return arrRoom.contains(m);
    }

    public House(ArrayList< Room> n){
        arrRoom=n;
    }

    public void printHouse() {
        System.out.println("В доме: ");
        for (Room a:arrRoom){ //
            System.out.println("\t"+a.toString());
        }
    }

    public void destroyRoom(Room m){
        arrRoom.remove(m);
    }

    public void amountOfRooms(){
        int varOffice = 0;
        int varApartment = 0;
        for (Room a:arrRoom) {
            if ( a instanceof Office){
                varOffice++;
            }
            if (a instanceof Apartment){
                varApartment++;
            }
        }
        System.out.println("Количество офисов => " + varOffice
        + "\nКоличество квартир => " + varApartment);
    }
}
