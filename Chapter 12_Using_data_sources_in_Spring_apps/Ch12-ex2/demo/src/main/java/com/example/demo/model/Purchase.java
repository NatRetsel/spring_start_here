package com.example.demo.model;

import java.math.BigDecimal;

public class Purchase {
    
    private int id;
    private String product;
    private BigDecimal price;
    
    public void setId(int id){this.id = id;}
    public void setProduct(String product){this.product = product;}
    public void setPrice(BigDecimal price){this.price = price;}

    public int getId(){return this.id;}
    public String getProduct(){return this.product;}
    public BigDecimal getPrice(){return this.price;}

}
