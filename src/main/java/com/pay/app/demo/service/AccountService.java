package com.pay.app.demo.service;

import com.pay.app.demo.model.Account;
import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();
    Account getAccountById(Long id);
    void addAccount(Account account);
    void updateAccount(Long id, Account updatedAccount);
    void deleteAccount(Long id);
}
