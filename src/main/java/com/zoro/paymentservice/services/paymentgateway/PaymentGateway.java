package com.zoro.paymentservice.services.paymentgateway;

public interface PaymentGateway {
    String generatePaymentLink(String orderId,String name,Long amount);

}
