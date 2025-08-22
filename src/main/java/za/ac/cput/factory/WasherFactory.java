package za.ac.cput.factory;

import za.ac.cput.domain.Washer;
import za.ac.cput.util.Helper;

public class WasherFactory {

    public static Washer createWasher(String firstName, String lastName, String email, String cellPhone,
                                      boolean availabilityStatus, int rating)  {
        if (Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) ||
                Helper.isNullOrEmpty(cellPhone)) {
            return null;
        }

        String washerId = Helper.generateWasherId(); // Auto-generate washer ID
        availabilityStatus = true;  // default
        rating = 0;  // default

        return new Washer.Builder()
                //.setUserId(userId)
                .setWasherId(washerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setCellPhone(cellPhone)
                .setAvailabilityStatus(availabilityStatus)
                .setRating(rating)
                .build();
    }
}
