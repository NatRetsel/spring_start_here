package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Purchase;
import com.example.demo.respository.PurchaseRepository;

@RestController
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;
    public PurchaseController(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping("/purchase")
    public void storePurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping("/purchase")
    public List<Purchase> findPurchases() {
        return purchaseRepository.findAllPurchases();
    }
}
