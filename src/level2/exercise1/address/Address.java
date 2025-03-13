package level2.exercise1.address;

public interface Address {
    String getFullAddress();

    void setStreet(String street);

    void setCity(String city);

    void setRegion(String region);

    void setPostalCode(String postalCode);

    void setCountry(String country);
}