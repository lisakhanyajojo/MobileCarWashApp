package za.ac.cput.domain;

public class Address {

    private String streetNumber;
    private String city;
    private String streetName;
    private String postalCode;
    private String suburb;


    public Address() {


    }

    public Address(String streetNumber, String city, String streetName, String postalCode, String suburb)
    {
        this.streetNumber = streetNumber;
        this.city = city;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.suburb = suburb;
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
}
