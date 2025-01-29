package com.pay.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card {

    @Id
    private Long id;
    private String cardNumber;
    private String cardType;
    private Double spendingLimit;

    private Long ownerId;

    // Constructors
    public Card() {}
    public Card(Long id, String cardNumber, String cardType, Double spendingLimit, Long ownerId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.spendingLimit = spendingLimit;
        this.ownerId = ownerId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Double getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(Double spendingLimit) {
        this.spendingLimit = spendingLimit;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}
