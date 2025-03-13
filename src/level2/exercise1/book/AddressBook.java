package level2.exercise1.book;

import level2.exercise1.contact.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        contacts.add(contact);
    }

    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }

        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            contact.display();
            System.out.println();
        }
    }
}
