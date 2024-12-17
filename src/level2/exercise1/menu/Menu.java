package level2.exercise1.menu;

import level2.exercise1.address.AbstractAddress;
import level2.exercise1.book.AddressBook;
import level2.exercise1.factory.AbstractFactory;
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
            showMenuOptions();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addContact(new NationalFactory(), "National");
                case 2 -> addContact(new InternationalFactory(), "International");
                case 3 -> addressBook.display();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void showMenuOptions() {
        System.out.println("\nMenu:");
        System.out.println("1. Add National Contact");
        System.out.println("2. Add International Contact");
        System.out.println("3. Display Address Book");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private void addContact(AbstractFactory factory, String type) {
        AbstractAddress address = factory.createAddress();
        fillAddressForm(address);

        String country = null;
        if (type.equals("International")) {
            country = setInternationalDetails(address);
        }

        AbstractPhoneNumber phoneNumber = factory.createPhoneNumber();
        setPhoneNumber(phoneNumber, type, country);

        addressBook.addAddress(address);
        addressBook.addPhoneNumber(phoneNumber);
    }

    private void fillAddressForm(AbstractAddress address) {
        System.out.print("Enter street: ");
        address.setStreet(scanner.nextLine());
        System.out.print("Enter city: ");
        address.setCity(scanner.nextLine());
        System.out.print("Enter region: ");
        address.setRegion(scanner.nextLine());
        System.out.print("Enter postal code: ");
        address.setPostalCode(scanner.nextLine());
    }

    private String setInternationalDetails(AbstractAddress address) {
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        address.setCountry(country.toUpperCase());
        return country;
    }

    private void setPhoneNumber(AbstractPhoneNumber phoneNumber, String type, String country) {
        if (type.equals("International")) {
            String prefix = CountryPrefixReader.getCountryPrefix(country);
            phoneNumber.setPrefix(prefix);
        }
        System.out.print("Enter phone number: ");
        phoneNumber.setNumber(scanner.nextLine());
    }
}
