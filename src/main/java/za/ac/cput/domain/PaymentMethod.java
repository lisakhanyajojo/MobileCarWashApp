package za.ac.cput.domain;

/*Booking POJO class

Author: AG Gwangqa (222843608)

Date: 09 May 2025 */

public class PaymentMethod {
    private int paymentMethodId;
    private String paymentMethodType;

    public PaymentMethod() {

    }
    public PaymentMethod(Builder builder) {

    }
    public int getPaymentMethodId() {

        return paymentMethodId;
    }

    public String getPaymentMethodType() {

        return paymentMethodType;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "paymentMethodId=" + paymentMethodId +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                '}';
    }
    public static class Builder {
        private int paymentMethodId;
        private String paymentMethodType;

        public Builder setPaymentMethodId(int paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }
        public Builder setPaymentMethodType(String paymentMethodType) {
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public Builder copy(PaymentMethod paymentMethod) {
            this.paymentMethodId = paymentMethod.paymentMethodId;
            this.paymentMethodType = paymentMethod.paymentMethodType;
            return this;
        }

        public PaymentMethod build() {
            return new PaymentMethod(this);
        }
    }

}
