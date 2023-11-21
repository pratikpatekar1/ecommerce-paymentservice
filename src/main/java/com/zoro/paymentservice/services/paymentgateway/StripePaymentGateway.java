package com.zoro.paymentservice.services.paymentgateway;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, String name, Long amount) {
        return null;
    }
}
