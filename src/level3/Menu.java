package level3;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            showMenuOptions();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> System.out.println("Select a vehicle to park: ");
                case 2 -> System.out.println("List of parked vehicles: ");
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void showMenuOptions() {
        System.out.println("\nMenu:");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Parked vehicles");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }
}
