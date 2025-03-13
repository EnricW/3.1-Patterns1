package level2.exercise1.contact;

import level2.exercise1.address.Address;
import level2.exercise1.phone.PhoneNumber;

public class Contact {
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber) {
        if (address == null || phoneNumber == null) {
            throw new IllegalArgumentException("Address and phone number cannot be null");
        }
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void display() {
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("Phone: " + phoneNumber.getFormattedNumber());
    }
}