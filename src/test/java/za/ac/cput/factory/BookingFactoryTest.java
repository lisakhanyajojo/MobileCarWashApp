package za.ac.cput.factory;
// Alunge Gwangqa @222843608

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    private static LocalDateTime dateTime1 = LocalDateTime.now();
    private static LocalDateTime dateTime2 = LocalDateTime.now().plusDays(1);

    private static Booking booking1 = BookingFactory.createBooking("B001", "U100", 11, dateTime1, "Cape Town");
    private static Booking booking2 = BookingFactory.createBooking("B002", "U200", 22, dateTime2, "Phillipi");
    private static Booking booking3 = BookingFactory.createBooking("B003", "U300", 22, dateTime2, "Khayelitsha");



    @Test
    void testCreateBookingSuccess() {
        assertNotNull(booking1);
        assertEquals("B001", booking1.getBookingId());
        assertEquals("U100", booking1.getUserId());
        assertEquals("Cape Town", booking1.getLocation());
        System.out.println("Test Booking Success: " + booking1);
    }

    @Test
    void testCreateBookingDifferentInputs() {
        assertNotNull(booking2);
        assertEquals("B002", booking2.getBookingId());
        assertEquals("Phillipi", booking2.getLocation());
        System.out.println("Test Booking Success (Different Inputs): " + booking2);
    }

    @Test
    void testCreateBookingFailsEmptyId() {
        assertNull(booking3);
        System.out.println("Test Booking Fails with Empty ID: " + booking3);


}}