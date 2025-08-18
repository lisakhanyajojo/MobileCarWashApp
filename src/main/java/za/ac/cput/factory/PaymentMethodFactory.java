package za.ac.cput.factory;

import za.ac.cput.domain.PaymentMethod;
import za.ac.cput.util.Helper;

public class PaymentMethodFactory {
    public static PaymentMethod createPayment(int paymentMethodId, String paymentMethodType) {
        if(Helper.isNullOrEmpty(paymentMethodType))
            return null;

        return new PaymentMethod.Builder()
                .setPaymentMethodId(paymentMethodId)
                .setPaymentMethodType(paymentMethodType)
                .build();
    }
}
