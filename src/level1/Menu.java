package level1;

import level1.exceptions.EmptyHistoryException;
import level1.exceptions.MaxHistorySizeReachedException;

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
            showMenu();
            option = scanner.nextLine();

        } while (!handleOption(option));

        scanner.close();
    }

    private void showMenu() {
        System.out.println("\n1. Add command"
                + "\n2. Delete command"
                + "\n3. Show commands"
                + "\n4. Exit");
    }

    private boolean handleOption(String option) {
        switch (option) {
            case "1":
                addCommand();
                break;
            case "2":
                deleteCommand();
                break;
            case "3":
                showCommands();
                break;
            case "4":
                System.out.println("Exiting...");
                return true;
            default:
                System.out.println("Invalid option.");
                return false;
        }
        return false;
    }

    private void addCommand() {
        System.out.print("Add command: ");
        String command = scanner.nextLine();
        try {
            undo.addCommand(command);
            System.out.println("Command added.");
        } catch (MaxHistorySizeReachedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteCommand() {
        try {
            undo.removeLastCommand();
            System.out.println("Last command deleted.");
        } catch (EmptyHistoryException e) {
            System.out.println(e.getMessage());
        }
    }

    private void showCommands() {
        try {
            undo.listCommands();
        } catch (EmptyHistoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
