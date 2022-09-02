package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.LongTermAccount;

public class LongAccountService implements AccountService {

    @Override
    public boolean withdraw(Customer customer, Account account, double amount) {
        LongTermAccount longTermAccount = (LongTermAccount) customer.getAccountFromAccountList(account);
        int yearNumber = longTermAccount.getYearNumber();
        if (yearNumber == 0)
            return true;
        return false;
    }

    @Override
    public boolean deposite(Customer customer, double amount) {
        return false;
    }
}
