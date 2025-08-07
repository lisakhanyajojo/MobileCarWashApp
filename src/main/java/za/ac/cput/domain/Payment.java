package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Payment {

    private int paymentId;
    private String bookingId;
    private double price;
    private LocalDateTime paymentDate;
    private String bankName;
    private long bankAccountNumber;
    private int paymentMethod;


    public Payment() {
    }
        public Payment(Builder builder) {
            this.paymentId = builder.paymentId;
            this.bookingId = builder.bookingId;
            this.price = builder.price;
            this.paymentDate = builder.paymentDate;
            this.bankName = builder.bankName;
            this.bankAccountNumber = builder.bankAccountNumber;
            this.paymentMethod = builder.paymentMethod;

    }
    public int getPaymentId() {
        return paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public String getBankName() {
        return bankName;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bookingId='" + bookingId + '\'' +
                ", price=" + price +
                ", paymentDate=" + paymentDate +
                ", bankName='" + bankName + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
    public static class Builder {
        private int paymentId;
        private String bookingId;
        private double price;
        private LocalDateTime paymentDate;
        private String bankName;
        private long bankAccountNumber;
        private int paymentMethod;

        public Builder setPaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setPaymentDate(LocalDateTime paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder setBankAccountNumber(long bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        public Builder setPaymentMethod(int paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Payment copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.bookingId = payment.bookingId;
            this.price = payment.price;
            this.paymentDate = payment.paymentDate;
            this.bankName = payment.bankName;
            this.bankAccountNumber = payment.bankAccountNumber;
            this.paymentMethod = payment.paymentMethod;
            return payment;

        }

        public Payment build() {
            return new Payment(this);
        }

    }
}

