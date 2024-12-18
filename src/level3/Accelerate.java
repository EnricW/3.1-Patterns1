package level3;

public class Accelerate implements Command {
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
