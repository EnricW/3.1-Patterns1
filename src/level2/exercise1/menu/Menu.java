package level2.exercise1.menu;

import level2.exercise1.address.AbstractAddress;
import level2.exercise1.book.AddressBook;
import level2.exercise1.factory.AbstractFactory;
import level2.exercise1.factory.FactoryMaker;
import level2.exercise1.factory.InternationalFactory;
import level2.exercise1.factory.NationalFactory;
import level2.exercise1.phone.AbstractPhoneNumber;
import level2.exercise1.utils.CountryPrefixReader;

import java.util.Scanner;

public class Menu {
    private final AddressBook addressBook = new AddressBook();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add National Entry");
            System.out.println("2. Add International Entry");
            System.out.println("3. Display Address Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addNationalEntry();
                    break;
                case 2:
                    addInternationalEntry();
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

    private void addNationalEntry() {
        AbstractFactory factory = new NationalFactory();
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

    private void addInternationalEntry() {
        AbstractFactory factory = new InternationalFactory();
        AbstractAddress address = factory.createAddress();

        System.out.print("Enter street: ");
        address.setStreet(scanner.nextLine());
        System.out.print("Enter city: ");
        address.setCity(scanner.nextLine());
        System.out.print("Enter region: ");
        address.setRegion(scanner.nextLine());
        System.out.print("Enter postal code: ");
        address.setPostalCode(scanner.nextLine());
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        address.setCountry(country.toUpperCase());

        String prefix = CountryPrefixReader.getCountryPrefix(country);

        AbstractPhoneNumber phoneNumber = factory.createPhoneNumber();
        System.out.print("Enter phone number: ");
        phoneNumber.setNumber(scanner.nextLine());
        phoneNumber.setPrefix(prefix);

        addressBook.addAddress(address);
        addressBook.addPhoneNumber(phoneNumber);
    }
}
