package za.ac.cput.domain;

/*Booking POJO class
Author: LJ Jojo (221030921)
Date: 10 May 2025 */

public class Washer extends User{
    private String washerId;
    private boolean availabilityStatus;
    private int rating;


    private Washer(Builder builder) {
        this.washerId = builder.washerId;
        this.availabilityStatus = builder.availabilityStatus;
        this.rating = builder.rating;
    }


    public String getWasherId() {
        return washerId;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "washerId='" + washerId + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", rating=" + rating +
                '}';
    }

    public static class Builder {
        private String washerId;
        private boolean availabilityStatus = true;
        private int rating = 0;

        public Builder setWasherId(String washerId) {
            this.washerId = washerId;
            return this;
        }

        public Builder setAvailabilityStatus(boolean availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public Builder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder copy(Washer washer) {
            this.washerId = washer.washerId;
            this.availabilityStatus = washer.availabilityStatus;
            this.rating = washer.rating;
            return this;
        }

        public Washer build() {

            return new Washer(this);

        }
    }
}
