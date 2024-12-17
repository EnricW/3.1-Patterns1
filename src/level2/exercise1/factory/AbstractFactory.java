package level2.exercise1.factory;

import level2.exercise1.address.AbstractAddress;
import level2.exercise1.phone.AbstractPhoneNumber;

public abstract class AbstractFactory {
    public abstract AbstractAddress createAddress();

    public abstract AbstractPhoneNumber createPhoneNumber();
}
