package level2.factory;

import level2.address.AbstractAddress;
import level2.address.EnglandAddress;
import level2.phone.AbstractPhoneNumber;
import level2.phone.EnglandPhoneNumber;

public class EnglandFactory extends AbstractFactory {
    public AbstractAddress createAddress() {
        return new EnglandAddress();
    }

    public AbstractPhoneNumber createPhoneNumber() {
        return new EnglandPhoneNumber();
    }
}
