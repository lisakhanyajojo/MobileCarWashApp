package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
class PaymentFactoryTest {

    private static Payment payment1 = PaymentFactory.createPayment(1, "ss", 2.21, LocalDateTime.now(), "BankName", 123456789L, 1);
    private static Payment payment2 =  PaymentFactory.createPayment(2," ss", 19.99, LocalDateTime.now(), "BankName", 123456789L, 1);

    static {
        try {
            // This should fail and set payment3 to null
            payment1 = PaymentFactory.createPayment(3, "ss", 9.9,LocalDateTime.now(), "BankName", 123456989L, 1);
        } catch (IllegalArgumentException e) {
            payment1 = null;

        }
    }

    @Test
    void createPayment() {

    }
}