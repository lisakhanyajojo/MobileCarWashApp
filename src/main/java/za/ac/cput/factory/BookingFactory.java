package za.ac.cput.factory;

import za.ac.cput.domain.Booking;

import java.time.LocalDateTime;

public class BookingFactory {
    public static Booking createBooking(String bookingId, String userId, int serviceId, LocalDateTime scheduledTime, String location) {
        if (bookingId == null || bookingId.isEmpty())
            return null;
        if (userId == null || userId.isEmpty())
            return null;
        if (scheduledTime == null)
            return null;
        if (location == null || location.isEmpty())
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

