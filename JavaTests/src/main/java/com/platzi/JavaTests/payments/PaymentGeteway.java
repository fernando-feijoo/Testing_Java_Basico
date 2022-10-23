package com.platzi.JavaTests.payments;

public interface PaymentGeteway {

    PaymentResponse requestPayment(PaymentRequest request);
}
