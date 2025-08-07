package za.ac.cput.factory;
// Alunge Gwangqa @222843608

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.PaymentMethod;

import static org.junit.jupiter.api.Assertions.*;

class PaymentMethodFactoryTest {

    private static PaymentMethod payment1 = PaymentMethodFactory.createPayment(1, "Cash");
    private static PaymentMethod payment2 = PaymentMethodFactory.createPayment(2, "Card");
    private static PaymentMethod payment3 = null;

    static {
        try {
            // This should fail and set payment3 to null
            payment3 = PaymentMethodFactory.createPayment(3, "");
        } catch (IllegalArgumentException e) {
            payment3 = null;
        }
    }

    @Test
    void testCreatePaymentMethodSuccess() {
        assertNotNull(payment1);
        assertEquals(1, payment1.getPaymentMethodId());
        assertEquals("Cash", payment1.getPaymentMethodType());
        System.out.println("Test PaymentMethod Success: " + payment1);
    }

    @Test
    void testCreatePaymentMethodDifferentInputs() {
        assertNotNull(payment2);
        assertEquals(2, payment2.getPaymentMethodId());
        assertEquals("Card", payment2.getPaymentMethodType());
        System.out.println("Test PaymentMethod Success (Different Inputs): " + payment2);
    }

    @Test
    void testCreatePaymentMethodFailsEmptyType() {
        assertNull(payment3);
        System.out.println("Test PaymentMethod Fails with Empty Type: " + payment3);
    }

    @Test
    void createPayment() {
    }
}
