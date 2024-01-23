package com.example.demo.model;

import java.math.BigDecimal;

public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;

    public void setSenderAccountId(long senderAccountId){this.senderAccountId=senderAccountId;}
    public void setReceiverAccountId(long receiverAccountId){this.receiverAccountId=receiverAccountId;}
    public void setAmount(BigDecimal amount){this.amount=amount;}

    public long getSenderAccountId(){return this.senderAccountId;}
    public long getReceiverAccountId(){return this.receiverAccountId;}
    public BigDecimal getAmount(){return this.amount;}
}
