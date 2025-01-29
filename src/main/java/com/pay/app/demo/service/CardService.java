package com.pay.app.demo.service;

import com.pay.app.demo.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CardService {

    List<Card> getAllCards();
    Card getCardById(Long id);
    void addCard(Card card);
    void updateCard(Long id, Card updatedCard);
    void deleteCard(Long id);
}
