//package za.ac.cput.factory;
//
//import za.ac.cput.domain.Washer;
//import za.ac.cput.util.Helper;
//
//public class WasherFactory {
//
//    public static Washer createWasher(String userId, String firstName, String lastName, String email, String cellPhone) {
//        if (Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(firstName) ||
//                Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) ||
//                Helper.isNullOrEmpty(cellPhone)) {
//            return null;
//        }
//
//        String washerId = Helper.generateWasherId(); // Auto-generate washer ID
//        boolean availabilityStatus = true;  // default
//        int rating = 0;  // default
//
//        return new Washer.Builder()
//                .setUserId(userId)
//                .setFirstName(firstName)
//                .setLastName(lastName)
//                .setEmail(email)
//                .setCellPhone(cellPhone)
//                .setWasherId(washerId)
//                .setAvailabilityStatus(availabilityStatus)
//                .setRating(rating)
//                .build();
//    }
//}
