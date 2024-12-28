package level3.vehicles;

public class Plane extends Vehicle {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Plane engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane is taking off");
    }

    @Override
    public void brake() {
        System.out.println("Plane is braking");
    }
}

