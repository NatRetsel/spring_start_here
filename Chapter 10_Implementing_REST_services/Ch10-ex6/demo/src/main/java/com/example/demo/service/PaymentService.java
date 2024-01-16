package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NotEnoughMoneyException;
import com.example.demo.model.PaymentDetails;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
