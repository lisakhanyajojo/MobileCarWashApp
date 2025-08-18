package za.ac.cput.factory;


import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.time.LocalDateTime;

public class PaymentFactory {

    public static Payment createPayment(int paymentId, String bookingId, double price, LocalDateTime paymentDate, String bankName, Long bankAccountNumber, int paymentMethod) {

        if (Helper.isNullOrEmpty(bookingId) || !Helper.isPriceDurationValid(price) || paymentDate == null || Helper.isNullOrEmpty(bankName) || bankAccountNumber == null || paymentMethod <= 0) {
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


