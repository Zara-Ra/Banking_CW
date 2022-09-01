package ir.maktab.banking.service;

import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;

public interface AccountService {
    boolean withdraw(Customer customer,double amount);
    boolean deposite(Customer customer, double amount);
}
