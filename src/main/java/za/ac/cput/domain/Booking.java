package za.ac.cput.domain;

/*Booking POJO class

Author: AG Gwangqa (222843608)


Date: 09 May 2025 */

import java.time.LocalDateTime;

public class Booking {

    private String bookingId;
    private String userId;
    private int serviceId;
    private LocalDateTime scheduledTime;
    private String location;

    public Booking() {
    }

    public Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.userId = builder.userId;
        this.serviceId = builder.serviceId;
        this.scheduledTime = builder.scheduledTime;
        this.location = builder.location;


    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", userId='" + userId + '\'' +
                ", serviceId=" + serviceId +
                ", scheduledTime=" + scheduledTime +
                ", location='" + location + '\'' +
                '}';
    }

    public static class Builder {
        private String bookingId;
        private String userId;
        private int serviceId;
        private LocalDateTime scheduledTime;
        private String location;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setScheduledTime(LocalDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.userId = booking.userId;
            this.serviceId = booking.serviceId;
            this.scheduledTime = booking.scheduledTime;
            this.location = booking.location;
            return this;
        }
      public Booking build() { return new Booking(this); }
  }
}


