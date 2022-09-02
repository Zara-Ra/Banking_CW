package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.ShortTermAccount;

public class ShortAccountService implements AccountService {
    @Override
    public double withdraw(Customer customer, Account account, double amount) {
        ShortTermAccount shortTermAccount = (ShortTermAccount) customer.getAccountFromAccountList(account);
        int yearNumber = shortTermAccount.getYearNumber();
        double balance = customer.calCustomerBalance(customer.getAccountFromAccountList(account));
        if (balance > amount && yearNumber == 0)
            return balance - amount;
        return -1;
    }
}
