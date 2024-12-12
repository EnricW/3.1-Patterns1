package level2.factory;

public class FactoryMaker {
    public static AbstractFactory getFactory(String country) {
        switch (country.toLowerCase()) {
            case "us":
                return new USFactory();
            case "england":
                return new EnglandFactory();
            default:
                throw new IllegalArgumentException("Unknown country: " + country);
        }
    }
}
