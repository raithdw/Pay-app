package com.pay.app.demo.service;

import com.pay.app.demo.model.Parent;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ParentService {
    List<Parent> getAllParents();
    Parent getParentById(Long id);
    void addParent(Parent parent);
    void updateParent(Long id, Parent updatedParent);
    void deleteParent(Long id);
}

