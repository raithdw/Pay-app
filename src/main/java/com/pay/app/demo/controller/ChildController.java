package com.pay.app.demo.controller;

import com.pay.app.demo.model.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pay.app.demo.service.ChildService;

import java.util.List;

@RestController
@RequestMapping("/api/children")
public class ChildController {

    private final ChildService childService;

    @Autowired
    public ChildController(ChildService childService) {
        this.childService = childService;
    }

    @GetMapping
    public List<Child> getAllChildren() {
        return childService.getAllChildren();
    }

    @GetMapping("/{id}")
    public Child getChildById(@PathVariable Long id) {
        return childService.getChildById(id);
    }

    @PostMapping
    public ResponseEntity<Child> addChild(@RequestBody Child child) {
        childService.addChild(child);
        return ResponseEntity.status(HttpStatus.CREATED).body(child);
    }

    @PutMapping("/{id}")
    public void updateChild(@PathVariable Long id, @RequestBody Child updatedChild) {
        childService.updateChild(id, updatedChild);
    }

    @DeleteMapping("/{id}")
    public void deleteChild(@PathVariable Long id) {
        childService.deleteChild(id);
    }
}
