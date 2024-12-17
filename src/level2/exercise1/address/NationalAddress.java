package level2.exercise1.address;

public class NationalAddress extends AbstractAddress {
    private String street, city, region, postalCode;

    public String getFullAddress() {
        return street + ", " + city + ", " + region + " " + postalCode + ", SPAIN";
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
    }
}
