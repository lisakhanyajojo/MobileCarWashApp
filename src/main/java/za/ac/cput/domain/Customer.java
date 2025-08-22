package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity

public class Customer extends User {

    private String carModel;
    private int carWashCount;
    private boolean freeWashActivated;
    private boolean freeBirthdayWash;
    private String bankName;
    private long bankAccountNumber;
    private String ratingId;

    @Embedded
    private Address address;

    public Customer() {
    }

    private Customer(Builder builder) {
        this.ratingId = builder.ratingId;
        this.address = builder.address;
        this.carModel = builder.carModel;
        this.carWashCount = builder.carWashCount;
        this.freeWashActivated = builder.freeWashActivated;
        this.freeBirthdayWash = builder.freeBirthdayWash;
        this.bankName = builder.bankName;
        this.bankAccountNumber = builder.bankAccountNumber;
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this.password = builder.password;
        this.notificationPreference = builder.notificationPreference;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.identificationNumber = builder.identificationNumber;
        this.userId = builder.userId; }

    public String getCarModel() { return carModel; }

    public int getCarWashCount() { return carWashCount; }

    public boolean isFreeWashActivated() { return freeWashActivated; }

    public boolean isFreeBirthdayWash() { return freeBirthdayWash; }

    public String getBankName() { return bankName; }

    public long getBankAccountNumber() { return bankAccountNumber; }

    public String getRatingId() { return ratingId; }

    public Address getAddress() { return address; }

    @Override public String toString() {
        return "Customer{" + "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", cellPhone=" + cellPhone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notificationPreference='" + notificationPreference + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carWashCount=" + carWashCount +
                ", freeWashActivated=" + freeWashActivated +
                ", freeBirthdayWash=" + freeBirthdayWash +
                ", bankName='" + bankName + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                ", ratingId=" + ratingId +
                ", address=" + address + '}'; }


    public static class Builder {

        private String userId;
        private String ratingId;
        private String firstName;
        private String lastName;
        private int carWashCount;
        private boolean freeWashActivated;
        private boolean freeBirthdayWash;
        private String bankName;
        private long bankAccountNumber;
        private long identificationNumber;
        private long cellPhone;
        private String email;
        private String notificationPreference;
        private String password;
        private String carModel;
        private Address address;

        public Builder setUserId(String userId) { this.userId = userId; return this; }

        public Builder setRatingId(String ratingId) { this.ratingId = ratingId; return this; }

        public Builder setFirstName(String firstName) { this.firstName = firstName; return this; }

        public Builder setLastName(String lastName) { this.lastName = lastName; return this; }

        public Builder setCarWashCount(int carWashCount) { this.carWashCount = carWashCount; return this; }

        public Builder setFreeWashActivated(boolean freeWashActivated) { this.freeWashActivated = freeWashActivated; return this; }

        public Builder setFreeBirthdayWash(boolean freeBirthdayWash) { this.freeBirthdayWash = freeBirthdayWash; return this; }

        public Builder setBankName(String bankName) { this.bankName = bankName; return this; }

        public Builder setBankAccountNumber(long bankAccountNumber) { this.bankAccountNumber = bankAccountNumber; return this; }

        public Builder setIdentificationNumber(long identificationNumber) { this.identificationNumber = identificationNumber; return this; }

        public Builder setCellPhone(long cellPhone) { this.cellPhone = cellPhone; return this; }

        public Builder setEmail(String email) { this.email = email; return this; }

        public Builder setNotificationPreference(String notificationPreference) { this.notificationPreference = notificationPreference; return this; }

        public Builder setPassword(String password) { this.password = password; return this; }

        public Builder setCarModel(String carModel) { this.carModel = carModel; return this; }

        public Builder setAddress(Address address) { this.address = address; return this; }


        public Builder copy(Customer customer) {

            this.userId = customer.userId;
            this.ratingId = customer.ratingId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.carWashCount = customer.carWashCount;
            this.freeWashActivated = customer.freeWashActivated;
            this.freeBirthdayWash = customer.freeBirthdayWash;
            this.bankName = customer.bankName;
            this.bankAccountNumber = customer.bankAccountNumber;
            this.identificationNumber = customer.identificationNumber;
            this.cellPhone = customer.cellPhone;
            this.email = customer.email;
            this.password = customer.password;
            this.notificationPreference = customer.notificationPreference;
            this.carModel = customer.carModel;
            this.address = customer.address; return this; }


        public Customer build() { return new Customer(this);}
    }
}