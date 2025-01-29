package com.pay.app.demo.service;

import com.pay.app.demo.model.Account;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class AccountServiceImpl implements AccountService {
    private Map<Long, Account> accounts = new HashMap<>();

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }

    public Account getAccountById(Long id) {
        return accounts.get(id);
    }

    public void addAccount(Account account) {
        if (accounts.containsKey(account.getId())) {
            throw new IllegalArgumentException("Account with ID " + account.getId() + " already exists.");
        }
        accounts.put(account.getId(), account);
    }

    public void updateAccount(Long id, Account updatedAccount) {
        if (!accounts.containsKey(id)) {
            throw new NoSuchElementException("Account with ID " + id + " not found.");
        }
        accounts.put(id, updatedAccount);
    }

    public void deleteAccount(Long id) {
        if (!accounts.containsKey(id)) {
            throw new NoSuchElementException("Account with ID " + id + " not found.");
        }
        accounts.remove(id);
    }
}
