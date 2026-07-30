package Q4;

public class UserRegistration {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        UserRegistration obj = new UserRegistration();

        try {
            obj.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            obj.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}