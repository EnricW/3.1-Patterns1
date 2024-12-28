package level3.commands;

import level3.vehicles.Vehicle;

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
