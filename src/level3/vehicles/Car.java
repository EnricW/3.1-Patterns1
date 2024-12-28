package level3.vehicles;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}
