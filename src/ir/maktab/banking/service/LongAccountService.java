package ir.maktab.banking.service;

import ir.maktab.banking.model.Customer;

public class LongAccountService implements AccountService{

    @Override
    public boolean withdraw(Customer customer, double amount) {
        //if()
        customer.getLongTermAccount().getYearNumber();
        customer.getLongTermAccount().getAnnualProfit();
        return false;
    }

    @Override
    public boolean deposite(Customer customer, double amount) {
        return false;
    }
}
