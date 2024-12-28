package level3.menu;

import level3.commands.Accelerate;
import level3.commands.Brake;
import level3.commands.Command;
import level3.commands.Start;
import level3.remote.RemoteControl;
import level3.vehicles.*;

import java.util.Scanner;

public class Menu {
    private RemoteControl remote;
    private Vehicle car, bicycle, plane, boat;

    public Menu() {
        this.remote = new RemoteControl();
        this.car = new Car("Toyota");
        this.bicycle = new Bicycle("Mountain Bike");
        this.plane = new Plane("Boeing 747");
        this.boat = new Boat("Yacht");
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect a vehicle:");
            System.out.println("1. Car");
            System.out.println("2. Bicycle");
            System.out.println("3. Plane");
            System.out.println("4. Boat");
            System.out.println("5. Exit");

            int vehicleChoice = scanner.nextInt();

            Vehicle selectedVehicle = null;
            switch (vehicleChoice) {
                case 1 -> selectedVehicle = car;
                case 2 -> selectedVehicle = bicycle;
                case 3 -> selectedVehicle = plane;
                case 4 -> selectedVehicle = boat;
                case 5 -> {
                    exit = true;
                    System.out.println("Exiting...");
                    continue;
                }
                default -> {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }
            }

            System.out.println("\nSelect an action:");
            System.out.println("1. Start");
            System.out.println("2. Accelerate");
            System.out.println("3. Brake");

            int actionChoice = scanner.nextInt();

            Command command = null;
            switch (actionChoice) {
                case 1 -> command = new Start(selectedVehicle);
                case 2 -> command = new Accelerate(selectedVehicle);
                case 3 -> command = new Brake(selectedVehicle);
                default -> System.out.println("Invalid action. Try again.");
            }

            if (command != null) {
                remote.submit(command);
            }
        }

        scanner.close();
    }
}
