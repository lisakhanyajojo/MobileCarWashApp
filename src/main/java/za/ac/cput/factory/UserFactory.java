package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {

    public static User createUser(String firstName,String lastName,long identificationNumber,long cellPhone,String email,String password,String notificationPreference){
        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || !Helper.isValidIdentificationNumber(identificationNumber)
        || !Helper.isValidCellPhone(cellPhone)  || Helper.isNullOrEmpty(password) || Helper.isNullOrEmpty(notificationPreference)){

                return null;
            }
        if(!Helper.isValidEmail(email)) {
                System.out.println("User fail,invalid email");
            return null;
        }
        return new User.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setIdentificationNumber(identificationNumber)
                .setCellPhone(cellPhone)
                .setEmail(email)
                .setPassword(password)
                .setNotificationPreference(notificationPreference) .build();
    }
}
