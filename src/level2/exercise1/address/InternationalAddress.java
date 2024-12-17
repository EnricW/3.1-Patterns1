package level2.exercise1.address;

public class InternationalAddress extends AbstractAddress {
    private String street, city, region, postalCode, country;

    public String getFullAddress() {
        return street + ", " + city + ", " + region + " " + postalCode + ", " + country;
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
        this.country = country;
    }
}
