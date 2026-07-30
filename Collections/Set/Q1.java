

import java.util.HashSet;

public class Q1 {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Q1 obj = new Q1();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("China"));
    }
}