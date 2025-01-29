package com.pay.app.demo.service;

import com.pay.app.demo.model.Parent;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ParentServiceImpl implements ParentService {
    private final Map<Long, Parent> parents = new HashMap<>();

    public List<Parent> getAllParents() {
        return new ArrayList<>(parents.values());
    }

    public Parent getParentById(Long id) {
        return parents.get(id);
    }

    public void addParent(Parent parent) {
        if (parents.containsKey(parent.getId())) {
            throw new IllegalArgumentException("Parent with ID " + parent.getId() + " already exists.");
        }
        parents.put(parent.getId(), parent);
    }

    public void updateParent(Long id, Parent updatedParent) {
        if (!parents.containsKey(id)) {
            throw new NoSuchElementException("Parent with ID " + id + " not found.");
        }
        parents.put(id, updatedParent);
    }

    public void deleteParent(Long id) {
        if (!parents.containsKey(id)) {
            throw new NoSuchElementException("Parent with ID " + id + " not found.");
        }
        parents.remove(id);
    }
}
