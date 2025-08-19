package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {

    public static User createUser(String userId,
                                  String firstName,
                                  String lastName,
                                  long identificationNumber,
                                  long cellPhone,
                                  String email,
                                  String password,
                                  String notificationPreference) {

        // Validate required fields
        if (Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) ||
                !Helper.isValidIdentificationNumber(identificationNumber) ||
                !Helper.isValidCellPhone(cellPhone) ||
                Helper.isNullOrEmpty(password) ||
                Helper.isNullOrEmpty(notificationPreference)) {
            System.out.println("User creation failed: missing or invalid required fields");
            return null;
        }

        if (!Helper.isNullOrEmpty(email) && !Helper.isValidEmail(email)) {
            System.out.println("User creation failed: invalid email");
            return null;
        }

        // Build the User
        return new User.Builder()
                .setUserId(userId)  // can be null; will auto-generate UUID
                .setFirstName(firstName)
                .setLastName(lastName)
                .setIdentificationNumber(identificationNumber)
                .setCellPhone(cellPhone)
                .setEmail(email)
                .setPassword(password)
                .setNotificationPreference(notificationPreference)
                .build();
    }
}
