package com.pay.app.demo.service;

import com.pay.app.demo.model.Child;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ChildServiceImpl implements ChildService {

    private final Map<Long, Child> children = new HashMap<>();

    public List<Child> getAllChildren() {
        return new ArrayList<>(children.values());
    }

    public Child getChildById(Long id) {
        return children.get(id);
    }

    public void addChild(Child child) {
        if (children.containsKey(child.getId())) {
            throw new IllegalArgumentException("Child with ID " + child.getId() + " already exists.");
        }
        children.put(child.getId(), child);
    }

    public void updateChild(Long id, Child updatedChild) {
        if (!children.containsKey(id)) {
            throw new NoSuchElementException("Child with ID " + id + " not found.");
        }
        children.put(id, updatedChild);
    }

    public void deleteChild(Long id) {
        if (!children.containsKey(id)) {
            throw new NoSuchElementException("Child with ID " + id + " not found.");
        }
        children.remove(id);
    }
}
