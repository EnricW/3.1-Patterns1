package level2.menu;

import level2.address.AbstractAddress;
import level2.book.AddressBook;
import level2.factory.AbstractFactory;
import level2.factory.FactoryMaker;
import level2.phone.AbstractPhoneNumber;

import java.util.Scanner;

public class Menu {
    private final AddressBook addressBook = new AddressBook();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add US Entry");
            System.out.println("2. Add England Entry");
            System.out.println("3. Display Address Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addEntry("us");
                    break;
                case 2:
                    addEntry("england");
                    break;
                case 3:
                    addressBook.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addEntry(String country) {
        AbstractFactory factory = FactoryMaker.getFactory(country);

        AbstractAddress address = factory.createAddress();
        System.out.print("Enter street: ");
        address.setStreet(scanner.nextLine());
        System.out.print("Enter city: ");
        address.setCity(scanner.nextLine());
        System.out.print("Enter region: ");
        address.setRegion(scanner.nextLine());
        System.out.print("Enter postal code: ");
        address.setPostalCode(scanner.nextLine());

        AbstractPhoneNumber phoneNumber = factory.createPhoneNumber();
        System.out.print("Enter phone number: ");
        phoneNumber.setNumber(scanner.nextLine());

        addressBook.addAddress(address);
        addressBook.addPhoneNumber(phoneNumber);
    }
}
