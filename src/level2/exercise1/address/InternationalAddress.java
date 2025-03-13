package level2.exercise1.address;

public class InternationalAddress implements Address {
    private String street, city, region, postalCode, country;

    @Override
    public String getFullAddress() {
        String formattedCountry = (country != null && !country.isEmpty()) ? country : "Unknown Country";
        return street + ", " + city + ", " + region + " " + postalCode + ", " + formattedCountry;
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
        this.country = country;
    }
}