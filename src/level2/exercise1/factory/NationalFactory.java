package level2.exercise1.factory;

import level2.exercise1.address.AbstractAddress;
import level2.exercise1.address.NationalAddress;
import level2.exercise1.phone.AbstractPhoneNumber;
import level2.exercise1.phone.NationalPhoneNumber;

public class NationalFactory extends AbstractFactory {
    public AbstractAddress createAddress() {
        return new NationalAddress();
    }

    public AbstractPhoneNumber createPhoneNumber() {
        return new NationalPhoneNumber();
    }
}
