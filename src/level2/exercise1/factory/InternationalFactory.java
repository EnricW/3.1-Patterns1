package level2.exercise1.factory;

import level2.exercise1.address.Address;
import level2.exercise1.address.InternationalAddress;
import level2.exercise1.phone.PhoneNumber;
import level2.exercise1.phone.InternationalPhoneNumber;

public class InternationalFactory implements AbstractFactory {
    @Override
    public Address createAddress() {
        return new InternationalAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new InternationalPhoneNumber();
    }
}
