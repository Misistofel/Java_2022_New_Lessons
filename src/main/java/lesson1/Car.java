package lesson1;

public class Car {
    public String model;

    public Car(String model) {
        this.model = model;
    }
   private void start(){
        System.out.println("Lets Go!");
    }
    private int numberOfDoors;


    class Engine{
        String engineType;
        public void startEngine(){
            System.out.println("Engine is started!");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        Car car = new Car("Lada");
      Car.Engine engine = car.new Engine();
      engine.startEngine();
    }
}

