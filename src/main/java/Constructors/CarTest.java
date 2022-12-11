package Constructors;

public class CarTest {

    public void  changeDoorNumrer(int newDoorNumber, Car car){
        car.doorNumber = newDoorNumber;
    }

    public void changeColors(Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }

}
