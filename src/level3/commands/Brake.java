package level3.commands;

import level3.vehicles.Vehicle;

public class Brake implements Command {
    private Vehicle vehicle;

    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
