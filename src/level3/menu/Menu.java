package level3.menu;

import level3.commands.Accelerate;
import level3.commands.Brake;
import level3.commands.Command;
import level3.commands.Start;
import level3.exceptions.InvalidActionChoiceException;
import level3.exceptions.InvalidInputException;
import level3.exceptions.InvalidVehicleChoiceException;
import level3.remote.RemoteControl;
import level3.vehicles.*;

import java.util.Scanner;

public class Menu {
    private final RemoteControl remote;
    private final Vehicle car, bicycle, plane, boat;

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
            try {
                Vehicle selectedVehicle = selectVehicle(scanner);
                if (selectedVehicle == null) {
                    exit = true;
                    continue;
                }

                Command command = selectAction(scanner, selectedVehicle);
                remote.submit(command);

            } catch (InvalidVehicleChoiceException | InvalidActionChoiceException | InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    private Vehicle selectVehicle(Scanner scanner) throws InvalidVehicleChoiceException {
        System.out.println("\nSelect a vehicle:\n1. Car\n2. Bicycle\n3. Plane\n4. Boat\n5. Exit");

        int vehicleChoice = getChoice(scanner, 5);
        if (vehicleChoice == 5) {
            System.out.println("Exiting...");
            return null;
        }

        return getVehicleByChoice(vehicleChoice);
    }

    private Command selectAction(Scanner scanner, Vehicle selectedVehicle) throws InvalidActionChoiceException {
        System.out.println("\nSelect an action:\n1. Start\n2. Accelerate\n3. Brake");

        int actionChoice = getChoice(scanner, 3);
        return getActionByChoice(actionChoice, selectedVehicle);
    }

    private int getChoice(Scanner scanner, int max) throws InvalidInputException {
        int choice = -1;
        while (choice < 1 || choice > max) {
            System.out.print("Please choose a valid option (1 to " + max + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
                throw new InvalidInputException("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }

    private Vehicle getVehicleByChoice(int vehicleChoice) throws InvalidVehicleChoiceException {
        return switch (vehicleChoice) {
            case 1 -> car;
            case 2 -> bicycle;
            case 3 -> plane;
            case 4 -> boat;
            default -> throw new InvalidVehicleChoiceException("Invalid vehicle choice. Please select a valid vehicle.");
        };
    }

    private Command getActionByChoice(int actionChoice, Vehicle selectedVehicle) throws InvalidActionChoiceException {
        return switch (actionChoice) {
            case 1 -> new Start(selectedVehicle);
            case 2 -> new Accelerate(selectedVehicle);
            case 3 -> new Brake(selectedVehicle);
            default -> throw new InvalidActionChoiceException("Invalid action choice. Please select a valid action.");
        };
    }
}
