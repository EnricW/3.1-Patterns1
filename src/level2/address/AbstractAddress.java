package level2.address;

public abstract class AbstractAddress {
    public abstract String getFullAddress();

    public abstract void setStreet(String street);

    public abstract void setCity(String city);

    public abstract void setRegion(String region);

    public abstract void setPostalCode(String postalCode);
}