package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.LongTermAccount;

public class LongAccountService implements AccountService {

    @Override
    public double withdraw(Customer customer, Account account, double amount) {
        LongTermAccount longTermAccount = (LongTermAccount) customer.getAccountFromAccountList(account);
        int yearNumber = longTermAccount.getYearNumber();
        double balance = customer.calCustomerBalance(customer.getAccountFromAccountList(account));
        if (balance > amount && yearNumber == 0)
            return balance - amount;
        return -1;
    }
}
