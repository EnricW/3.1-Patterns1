package level3;

public class StartEngine implements Command {
    private Vehicle vehicle;

    public StartEngine(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.startEngine();
    }
}
