package za.ac.cput.domain;

public class AdminManager extends User {

    private String adminManagerId;

    protected AdminManager(){
        super();
    }

    public String getAdminManagerId() {
        return adminManagerId;
    }

    public AdminManager (Builder builder){
        this.adminManagerId = builder.adminManagerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.identificationNumber = builder.identificationNumber;
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this. password = builder. password;
        this.notificationPreference = builder.notificationPreference;
    }

    @Override
    public String toString() {
        return "AdminManager{" +
                "adminManagerId='" + adminManagerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", cellPhone=" + cellPhone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notificationPreference='" + notificationPreference + '\'' +
                '}';
    }
       public static class Builder {
           private String adminManagerId;
           private String firstName;
           private String lastName;
           private long identificationNumber;
           private long cellPhone;
           private String email;
           private String userId;
           private String password;
           private String notificationPreference;

           public Builder setAdminManagerId(String adminManagerId) {
               this.adminManagerId = adminManagerId;
               return this;
           }

           public Builder setFirstName(String firstName) {
               this.firstName = firstName;
               return this;
           }

           public Builder setLastName(String lastName) {
               this.lastName = lastName;
               return this;
           }

           public Builder setIdentificationNumber(long identificationNumber) {
               this.identificationNumber = identificationNumber;
               return this;
           }

           public Builder setCellPhone(long cellPhone) {
               this.cellPhone = cellPhone;
               return this;
           }

           public Builder setEmail(String email) {
               this.email = email;
               return this;
           }


           public Builder setPassword(String password) {
               this.password = password;
               return this;
           }

           public Builder setNotificationPreference(String notificationPreference) {
               this.notificationPreference = notificationPreference;
               return this;
           }

           public AdminManager.Builder copy(User user) {
               this.adminManagerId = adminManagerId;
               this.firstName = user.firstName;
               this.lastName = user.lastName;
               this.identificationNumber = user.identificationNumber;
               this.cellPhone = user.cellPhone;
               this.email = user.email;
               this.password = user.password;
               this.notificationPreference = user.notificationPreference;
               return this;
           }

           public AdminManager build() {
               return new AdminManager(this);
           }
       }

}
