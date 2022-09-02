package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;

public interface AccountService {
    double withdraw(Customer customer, Account account, double amount);

    default double deposite(Customer customer,Account account, double amount){
        double balance = customer.calCustomerBalance(customer.getAccountFromAccountList(account));
        balance += amount;
        return balance;
    }
}
