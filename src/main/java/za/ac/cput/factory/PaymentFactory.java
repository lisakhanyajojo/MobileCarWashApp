package za.ac.cput.factory;


import za.ac.cput.domain.Payment;

import java.time.LocalDateTime;

public class PaymentFactory {

    public static Payment createPayment(int paymentId, String bookingId, double price, LocalDateTime paymentDate, String bankName, Long bankAccountNumber, int paymentMethod) {
        if (paymentId <= 0 || bookingId == null || bookingId.isEmpty() || price <= 0 || paymentDate == null
                || bankName == null || bankName.isEmpty() || bankAccountNumber <= 0 || paymentMethod < 1) {
            return null;


        }
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setBookingId(bookingId)
                .setPrice(price)
                .setPaymentDate(paymentDate)
                .setBankName(bankName)
                .setBankAccountNumber(bankAccountNumber)
                .setPaymentMethod(paymentMethod)
                .build();
    }
}
