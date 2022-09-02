package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;

public class NoProfitAccountService implements AccountService {
    @Override
    public boolean withdraw(Customer customer, Account account, double amount) {
        double balance = customer.calCustomerBalance(customer.getAccountFromAccountList(account));
        if (balance > amount)
            return true;
        return false;
    }

    @Override
    public boolean deposite(Customer customer, double amount) {
        return false;
    }
}
