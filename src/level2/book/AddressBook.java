package level2.book;

import level2.address.AbstractAddress;
import level2.phone.AbstractPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<AbstractAddress> addresses = new ArrayList<>();
    private final List<AbstractPhoneNumber> phoneNumbers = new ArrayList<>();

    public void addAddress(AbstractAddress address) {
        addresses.add(address);
    }

    public void addPhoneNumber(AbstractPhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void display() {
        System.out.println("Addresses:");
        for (AbstractAddress address : addresses) {
            System.out.println(address.getFullAddress());
        }

        System.out.println("\nPhone Numbers:");
        for (AbstractPhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber.getFormattedNumber());
        }
    }
}
