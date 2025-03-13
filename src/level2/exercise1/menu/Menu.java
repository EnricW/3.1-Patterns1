package level2.exercise1.menu;

import level2.exercise1.book.AddressBook;
import level2.exercise1.contact.Contact;
import level2.exercise1.factory.AbstractFactory;
import level2.exercise1.factory.InternationalFactory;
import level2.exercise1.factory.NationalFactory;
import level2.exercise1.utils.CountryPrefixReader;
import level2.exercise1.address.Address;
import level2.exercise1.phone.PhoneNumber;

import java.util.Scanner;

public class Menu {
    private final AddressBook addressBook = new AddressBook();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            showMenuOptions();
            int option = getValidMenuOption();

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

    private int getValidMenuOption() {
        while (true) {
            try {
                int option = Integer.parseInt(scanner.nextLine().trim());
                if (option >= 1 && option <= 4) {
                    return option;
                }
                System.out.println("Invalid option. Please enter a number between 1 and 4.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private void addContact(AbstractFactory factory, String type) {
        Address address = factory.createAddress();
        fillAddressForm(address);

        String country = null;
        if (type.equals("International")) {
            country = setInternationalDetails(address);
        }

        PhoneNumber phoneNumber = factory.createPhoneNumber();
        setPhoneNumber(phoneNumber, type, country);

        Contact contact = new Contact(address, phoneNumber);
        addressBook.addContact(contact);
        System.out.println("Contact added successfully!");
    }

    private void fillAddressForm(Address address) {
        address.setStreet(getValidInput("Enter street: "));
        address.setCity(getValidInput("Enter city: "));
        address.setRegion(getValidInput("Enter region: "));
        address.setPostalCode(getValidInput("Enter postal code: "));
    }

    private String setInternationalDetails(Address address) {
        String country = getValidInput("Enter country: ");
        address.setCountry(country.toUpperCase());
        return country;
    }

    private void setPhoneNumber(PhoneNumber phoneNumber, String type, String country) {
        if (type.equals("International")) {
            String prefix = CountryPrefixReader.getCountryPrefix(country);
            phoneNumber.setPrefix(prefix);
        }
        phoneNumber.setNumber(getValidInput("Enter phone number: "));
    }

    private String getValidInput(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("This field cannot be empty. Please enter a valid value.");
            }
        } while (input.isEmpty());
        return input;
    }
}
