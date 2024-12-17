package level2.exercise1.factory;

import level2.exercise1.address.AbstractAddress;
import level2.exercise1.address.InternationalAddress;
import level2.exercise1.phone.AbstractPhoneNumber;
import level2.exercise1.phone.InternationalPhoneNumber;

public class InternationalFactory extends AbstractFactory {
    public AbstractAddress createAddress() {
        return new InternationalAddress();
    }

    public AbstractPhoneNumber createPhoneNumber() {
        return new InternationalPhoneNumber();
    }
}
