package level2.factory;

import level2.address.AbstractAddress;
import level2.address.USAddress;
import level2.phone.AbstractPhoneNumber;
import level2.phone.USPhoneNumber;

public class USFactory extends AbstractFactory {
    public AbstractAddress createAddress() {
        return new USAddress();
    }

    public AbstractPhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
