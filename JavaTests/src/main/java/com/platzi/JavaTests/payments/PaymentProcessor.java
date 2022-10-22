package com.platzi.JavaTests.payments;

public class PaymentProcessor {

    private PaymentGeteway paymentGeteway;

    public PaymentProcessor(PaymentGeteway paymentGeteway) {
        this.paymentGeteway = paymentGeteway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGeteway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        } else {
            return false;
        }
    }
}
