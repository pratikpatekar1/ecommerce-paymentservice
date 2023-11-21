package com.zoro.paymentservice.strategies;

import com.zoro.paymentservice.services.paymentgateway.PaymentGateway;
import com.zoro.paymentservice.services.paymentgateway.RazorpayPaymentGateway;
import com.zoro.paymentservice.services.paymentgateway.StripePaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayChooserStrategy {
    private PaymentGateway razorpayPaymentGateway;
    private PaymentGateway stripePaymentGateway;
    public PaymentGatewayChooserStrategy(RazorpayPaymentGateway razorpayPaymentGateway, StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getTestPaymentGateway(String paymentGatewayType){
        if(paymentGatewayType.equals("razorpay")){
            return razorpayPaymentGateway;
        }else if(paymentGatewayType.equals("stripe")){
            return stripePaymentGateway;
        }
        return null;
    }
}
