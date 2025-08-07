package za.ac.cput.domain;

public class Rating {
    private final String ratingId;
    private final String bookingId;
    private final String customerId;
    private final String washerId;
    private final int ratingValue;


    private Rating(Builder builder) {
        this.ratingId = builder.ratingId;
        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.washerId = builder.washerId;
        this.ratingValue = builder.ratingValue;
    }


    public String getRatingId() {
        return ratingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getWasherId() {
        return washerId;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", washerId='" + washerId + '\'' +
                ", ratingValue=" + ratingValue +
                '}';
    }

    // Builder class
    public static class Builder {
        private String ratingId;
        private String bookingId;
        private String customerId;
        private String washerId;
        private int ratingValue;

        public Builder setRatingId(String ratingId) {
            this.ratingId = ratingId;
            return this;
        }

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setWasherId(String washerId) {
            this.washerId = washerId;
            return this;
        }

        public Builder setRatingValue(int ratingValue) {
            this.ratingValue = ratingValue;
            return this;
        }

        public Builder copy(Rating rating) {
            this.ratingId = rating.ratingId;
            this.bookingId = rating.bookingId;
            this.customerId = rating.customerId;
            this.washerId = rating.washerId;
            this.ratingValue = rating.ratingValue;
            return this;
        }

        public Rating build() {
            return new Rating(this);
        }
    }
}
