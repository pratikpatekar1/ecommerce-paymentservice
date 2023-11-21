package com.zoro.paymentservice.controllers;

import com.zoro.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping("/initiate/{orderId}")
    public String initiatePayment(@PathVariable("orderId") String orderId){
        return paymentService.initiatePayment(orderId);
    }
}
