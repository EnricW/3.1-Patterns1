package level2.exercise1.factory;

import level2.exercise1.address.Address;
import level2.exercise1.phone.PhoneNumber;

public interface AbstractFactory {
    Address createAddress();

    PhoneNumber createPhoneNumber();
}
