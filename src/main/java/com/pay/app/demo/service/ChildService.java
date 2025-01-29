package com.pay.app.demo.service;

import com.pay.app.demo.model.Child;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ChildService {
    List<Child> getAllChildren();
    Child getChildById(Long id);
    void addChild(Child parent);
    void updateChild(Long id, Child updatedChild);
    void deleteChild(Long id);
}
