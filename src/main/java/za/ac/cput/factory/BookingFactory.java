package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;

import java.time.LocalDateTime;

public class BookingFactory {
    public static Booking createBooking(String bookingId, String userId, int serviceId, LocalDateTime scheduledTime, String location) {
        // Validate inputs
        if (Helper.isNullOrEmpty(bookingId)|| Helper.isNullOrEmpty(userId) || serviceId <= 0 || scheduledTime == null || Helper.isNullOrEmpty(location))
            return null;

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setUserId(userId)
                .setServiceId(serviceId)
                .setScheduledTime(scheduledTime)
                .setLocation(location)
                .build();

    }
}

