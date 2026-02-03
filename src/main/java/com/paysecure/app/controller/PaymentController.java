package com.paysecure.app.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController {

    private final Counter paymentCounter;

    public PaymentController(MeterRegistry registry) {
    this.paymentCounter = registry.counter("paysecure_payments_total");
    }


    @GetMapping("/health")
    public String health() {
        return "PaySecure service is running";
    }

    @GetMapping("/payment/status")
    public Map<String, String> paymentStatus(
            @RequestParam(defaultValue = "TXN123") String transactionId) {
                paymentCounter.increment();
        Map<String, String> response = new HashMap<>();
        response.put("transactionId", transactionId);
        response.put("status", "SUCCESS");
        response.put("service", "PaySecure");
        return response;
    }
}