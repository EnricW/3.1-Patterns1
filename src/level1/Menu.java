package level1;

import java.util.Scanner;

public class Menu {
    private final Undo undo;
    private final Scanner scanner;

    public Menu() {
        undo = Undo.getInstance();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        String option;

        do {
            System.out.println("\n1. Add command");
            System.out.println("2. Delete command");
            System.out.println("3. Show commands");
            System.out.println("4. Exit");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Add command: ");
                    String command = scanner.nextLine();
                    undo.addCommand(command);
                    System.out.println("Command added.");
                    break;

                case "2":
                    undo.removeLastCommand();
                    System.out.println("Last command deleted.");
                    break;

                case "3":
                    undo.listCommands();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (!option.equals("4"));

        scanner.close();
    }
}
