package za.ac.cput.factory;

import za.ac.cput.domain.AdminManager;
import za.ac.cput.util.Helper;

public class AdminManagerFactory {

    public static AdminManager createAdminManager(String AdminManagerId ,String firstName,String lastName,long identificationNumber,long cellPhone,String email,String password,String notificationPreference){
        if(Helper.isNullOrEmpty(AdminManagerId) || Helper.isNullOrEmpty(firstName)
        || Helper.isNullOrEmpty(lastName) || Helper.isValidIdentificationNumber(identificationNumber)  ||  Helper.isNullOrEmpty(password) || Helper.isNullOrEmpty(notificationPreference)){
         return null;
        }
        if(!Helper.isValidEmail(email)){
            System.out.println("invalid email");
            return null;
        }
        if(!Helper.isValidCellPhone(cellPhone)){
            System.out.println("invalid cellphone number");
            return null;
        }

        return new AdminManager.Builder().setAdminManagerId(AdminManagerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setIdentificationNumber(identificationNumber)
                .setCellPhone(cellPhone)
                .setEmail(email)
                .setPassword(password)
                .setNotificationPreference(notificationPreference).build();
    }
}
