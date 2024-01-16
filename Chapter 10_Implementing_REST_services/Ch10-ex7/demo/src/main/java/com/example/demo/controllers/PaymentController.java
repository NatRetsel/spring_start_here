package com.example.demo.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentDetails;


@RestController
public class PaymentController {
     
	private static Logger logger = Logger.getLogger(PaymentController.class.getName());
	
	@PostMapping("/payment") 
	public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {
		logger.info("Received payment "+ paymentDetails.getAmount());
		
		return ResponseEntity 
				.status(HttpStatus.ACCEPTED) 
				.body(paymentDetails);  
		
	}
}
