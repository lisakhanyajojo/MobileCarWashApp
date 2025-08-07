package za.ac.cput.factory;

import za.ac.cput.domain.PaymentMethod;

public class PaymentMethodFactory {
    public static PaymentMethod createPayment(int paymentMethodId, String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.isEmpty())
            return null;

        return new PaymentMethod.Builder()
                .setPaymentMethodId(paymentMethodId)
                .setPaymentMethodType(paymentMethodType)
                .build();
    }
}
