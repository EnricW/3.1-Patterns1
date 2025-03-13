package level2.exercise1.address;

public class NationalAddress implements Address {
    private String street, city, region, postalCode;

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", " + region + " " + postalCode + ", SPAIN";
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public void setCountry(String country) {
    }
}