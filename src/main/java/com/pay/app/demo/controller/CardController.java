package com.pay.app.demo.controller;

import com.pay.app.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pay.app.demo.service.CardService;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable Long id) {
        return cardService.getCardById(id);
    }

    @PostMapping
    public ResponseEntity<Card> addCard(@RequestBody Card card) {
        cardService.addCard(card);
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @PutMapping("/{id}")
    public void updateCard(@PathVariable Long id, @RequestBody Card updatedCard) {
        cardService.updateCard(id, updatedCard);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardService.deleteCard(id);
    }
}
