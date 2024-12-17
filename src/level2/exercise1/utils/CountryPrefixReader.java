package level2.exercise1.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CountryPrefixReader {
    private static final String COUNTRIES_FILE_PATH = "src/level2/exercise1/resources/countries.txt";

    private static final Map<String, String> countryPrefixes = new HashMap<>();

    static {
        try (BufferedReader br = new BufferedReader(new FileReader(COUNTRIES_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    countryPrefixes.put(parts[0].trim().toUpperCase(), parts[1].trim());
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading country prefixes. Using default values.");
        }
    }

    public static String getCountryPrefix(String country) {
        return countryPrefixes.getOrDefault(country, "+00");
    }
}
