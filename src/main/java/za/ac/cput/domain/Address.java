package za.ac.cput.domain;

import jakarta.persistence.*;


@Embeddable
public class Address {

    private String streetNumber;
    private String city;
    private String streetName;
    private String postalCode;
    private String suburb;


    public Address(){

    }
    public Address(String streetNumber, String streetName, String city, String postalCode, String suburb) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.suburb = suburb;
    }

    public Address(Builder builder) {
        this.streetNumber = builder.streetNumber;
        this.city = builder.city;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.suburb = builder.suburb;

    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getSuburb() {
        return suburb;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", suburb='" + suburb + '\'' +
                '}';
    }
    public static class Builder {
        private String streetNumber;
        private String city;
        private String streetName;
        private String postalCode;
        private String suburb;

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }
        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder copy(Address address) {
            this.streetNumber = address.streetNumber;
            this.city = address.city;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.suburb = address.suburb;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
