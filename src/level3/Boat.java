package level3;

public class Boat implements Vehicle {
    @Override
    public void startEngine() {
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
