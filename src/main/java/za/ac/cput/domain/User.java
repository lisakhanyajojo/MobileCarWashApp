package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.UUID;


/*User POJO class

Author: Ntombelanga Gqutyana (221646973)

Date: 09 May 2025 */
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
public class User{

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    protected String userId;
    @Column(nullable = false)
    protected  String firstName;
    @Column(nullable = false)
    protected  String lastName;
    @Column(name = "id_number", nullable = false)
    protected  long identificationNumber;
    @Column(name = "cell_phone", nullable = false)
    protected   long cellPhone;

    protected  String email;
    @Column(nullable = false)
    protected  String password;
    @Column(name = "notification_preference")
    protected  String notificationPreference;

    protected User(){

    }
    @PrePersist
    public void generateId() {
        if (this.userId == null) {
            this.userId = UUID.randomUUID().toString();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getIdentificationNumber() {
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
                ", notificationPreference='" + notificationPreference + '\'' +
                '}';
    }
    public static class Builder{
        private  String firstName;
        private String lastName;
        private long identificationNumber;
        private  long cellPhone;
        private String email;
        private String userId;
        private String password;
        private String notificationPreference;




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

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public Builder  setNotificationPreference(String notificationPreference) {
            this.notificationPreference = notificationPreference;
            return this;
        }

        public Builder copy(User user) {
            this.firstName = user.getFirstName();
            this.lastName = user.getLastName();
            this.identificationNumber = user.getIdentificationNumber();
            this.cellPhone = user.getCellPhone();
            this.email = user.getEmail();
            this.userId =user.userId;
            this.password = user.getPassword();
            this.notificationPreference = user.getNotificationPreference();
        return this;
            }

        public User build(){
            return new User(this);
        }


    }
}
