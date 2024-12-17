package level2.exercise1.factory;

public class FactoryMaker {
    public static AbstractFactory getFactory(String country) {
        switch (country.toLowerCase()) {
            case "us":
                return new InternationalFactory();
            case "england":
                return new NationalFactory();
            default:
                throw new IllegalArgumentException("Unknown country: " + country);
        }
    }
}
