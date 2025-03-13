package level2.exercise1.factory;

import level2.exercise1.address.Address;
import level2.exercise1.address.NationalAddress;
import level2.exercise1.phone.PhoneNumber;
import level2.exercise1.phone.NationalPhoneNumber;

public class NationalFactory implements AbstractFactory {
    @Override
    public Address createAddress() {
        return new NationalAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new NationalPhoneNumber();
    }
}
