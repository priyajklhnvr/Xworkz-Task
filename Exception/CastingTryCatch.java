class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void drive() {
        System.out.println("Car is being driven");
    }
}

public class CastingTryCatch {
    public static void main(String[] args) {

        Car car = new Car();

        Object obj = car;

        try {

            Car castedCar = (Car) obj;
            castedCar.start();
            castedCar.drive();

            Vehicle downcastedVehicle = (Vehicle) obj;
            downcastedVehicle.start();
        } catch (ClassCastException e) {
            System.err.println("Failed to downcast obj: " + e.getMessage());
        }
    }
}
