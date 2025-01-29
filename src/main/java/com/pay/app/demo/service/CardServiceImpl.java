package com.pay.app.demo.service;

import com.pay.app.demo.model.Card;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class CardServiceImpl implements CardService {

    private final Map<Long, Card> cards = new HashMap<>();

    public List<Card> getAllCards() {
        return new ArrayList<>(cards.values());
    }

    public Card getCardById(Long id) {
        return cards.get(id);
    }

    public void addCard(Card card) {
        if (cards.containsKey(card.getId())) {
            throw new IllegalArgumentException("Card with ID " + card.getId() + " already exists.");
        }
        cards.put(card.getId(), card);
    }

    public void updateCard(Long id, Card updatedCard) {
        if (!cards.containsKey(id)) {
            throw new NoSuchElementException("Card with ID " + id + " not found.");
        }
        cards.put(id, updatedCard);
    }

    public void deleteCard(Long id) {
        if (!cards.containsKey(id)) {
            throw new NoSuchElementException("Card with ID " + id + " not found.");
        }
        cards.remove(id);
    }
}
