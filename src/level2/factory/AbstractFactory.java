package level2.factory;

import level2.address.AbstractAddress;
import level2.phone.AbstractPhoneNumber;

public abstract class AbstractFactory {
    public abstract AbstractAddress createAddress();

    public abstract AbstractPhoneNumber createPhoneNumber();
}
