package Example;

import Example.Car;
import Example.GarageCar;

public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar();
        Car myCar1=new Car("Ford", 200,"Mustang",2,false);
        myGarage.addCar(myCar1);
        myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false));
        Truck myTruck=new Truck("Dove",160,"DTS",700,true);
        myGarage.addCar(myTruck);
        myGarage.printGarage();
        if (myGarage.findCar(myCar1)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}
