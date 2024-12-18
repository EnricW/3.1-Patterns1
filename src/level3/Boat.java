package level3;

public class Boat extends Vehicle {
    public Boat(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Boat engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Boat is braking");
    }
}
