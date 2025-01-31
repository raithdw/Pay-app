package com.pay.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Parent {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    private List<Long> childrenIds = new ArrayList<>();
    private List<Long> accountIds = new ArrayList<>();
    private List<Long> cardIds = new ArrayList<>();


    /**
     * FOSI: I don't think that we need separate Parent / Child tables.
     * Let's store a list of parents (a child can have 2 parents) and a list of children in this entity (maybe rename it to "Client")
     * -----------------------------------------------------------------------------------------------------------------
     * FOSI: The magic of Hibernate / JPA is that we don't store list of ids.
     * We store list of the entities that we are mapping to, and hibernate will auto-magically do the binding using the id columns for us
     * -----------------------------------------------------------------------------------------------------------------
     * FOSI: Let's double check the entity mappings
     * A client has 1/M accounts
     * An account is owned by a single client
     * A card points to a single account
     * A card is owned by a single client
     * A client can have 1/M card
     * For an account we can have multiple cards
     * -----------------------------------------------------------------------------------------------------------------
     * FOSI: You familiar with Lombok?
     * -----------------------------------------------------------------------------------------------------------------
     * FOSI: ID autogeneration
     */

    // Constructors
    public Parent() {}
    public Parent(String name, String email) {
        this.name = name;
        this.email = email;
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

    public List<Long> getChildrenIds() {
        return childrenIds;
    }

    public void setChildrenIds(List<Long> childrenIds) {
        this.childrenIds = childrenIds;
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
