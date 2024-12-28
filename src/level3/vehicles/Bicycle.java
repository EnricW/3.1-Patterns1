package level3.vehicles;

public class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Bicycle ride started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking");
    }
}
