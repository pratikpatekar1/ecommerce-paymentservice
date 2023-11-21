package com.zoro.paymentservice.services;

import com.zoro.paymentservice.services.paymentgateway.PaymentGateway;
import com.zoro.paymentservice.strategies.PaymentGatewayChooserStrategy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;
    public PaymentService(PaymentGatewayChooserStrategy paymentGatewayChooserStrategy){
        this.paymentGatewayChooserStrategy = paymentGatewayChooserStrategy;
    }
    public String initiatePayment(String orderId){
        //Get the details from order service
        //Order order = orderService.getOrder(orderId);
        //Long amount = order.getAmount();
        //String name = order.getName();
        //...
        String name = "Pratik";
        Long amount = 1000000L; //amount*100 instead of decimals
        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getTestPaymentGateway("razorpay");

        return paymentGateway.generatePaymentLink(orderId,name,amount);
    }
}
