package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.ShortTermAccount;

public class ShortAccountService implements AccountService {
    @Override
    public boolean withdraw(Customer customer, Account account, double amount) {
        ShortTermAccount shortTermAccount = (ShortTermAccount) customer.getAccountFromAccountList(account);
        int yearNumber = shortTermAccount.getYearNumber();
        if (yearNumber == 0)
            return true;
        return false;
    }

    @Override
    public boolean deposite(Customer customer, double amount) {
        return false;
    }
}
