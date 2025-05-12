package za.ac.cput.domain;
/*User POJO class

Author: Ntombelanga Gqutyana (221646973)

Date: 09 May 2025 */
public class User{
    private  String firstName;
    private String lastName;
    private int identificationNumber;
    private  long cellPhone;
    private String email;
    private String userId;
    private String password;
    private String currentLocation;
    private String notificationPreference;

    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public long getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }
    public User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.identificationNumber = builder.identificationNumber;
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this.userId = builder.userId;
        this.password = builder.password;
        this.currentLocation = builder.currentLocation;
        this.notificationPreference = builder.notificationPreference;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", cellPhone=" + cellPhone +
                ", email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", notificationPreference='" + notificationPreference + '\'' +
                '}';
    }
    public static class Builder{
        private  String firstName;
        private String lastName;
        private int identificationNumber;
        private  long cellPhone;
        private String email;
        private String userId;
        private String password;
        private String currentLocation;
        private String notificationPreference;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setIdentificationNumber(int identificationNumber) {
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

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public  Builder setCurrentLocation(String currentLocation) {
            this.currentLocation = currentLocation;
            return this;
        }

        public Builder  setNotificationPreference(String notificationPreference) {
            this.notificationPreference = notificationPreference;
            return this;
        }

        public Builder copy(User user) {
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.identificationNumber = user.identificationNumber;
            this.cellPhone = user.cellPhone;
            this.email = user.email;
            this.userId =user.userId;
            this.password = user.password;
            this.currentLocation = user.currentLocation;
            this.notificationPreference = user.notificationPreference;
        return this;
            }

        public User build(){
            return new User(this);
        }


    }
}
