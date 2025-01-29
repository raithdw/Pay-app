package com.pay.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Child {

    @Id
    private Long id;
    private String name;
    private String email;

    private Long parentId;
    private List<Long> accountIds = new ArrayList<>();
    private List<Long> cardIds = new ArrayList<>();

    // Constructors
    public Child() {}
    public Child(Long id, String name, String email, Long parentId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.parentId = parentId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<Long> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<Long> accountIds) {
        this.accountIds = accountIds;
    }

    public List<Long> getCardIds() {
        return cardIds;
    }

    public void setCardIds(List<Long> cardIds) {
        this.cardIds = cardIds;
    }
}
