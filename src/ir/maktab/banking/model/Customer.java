package ir.maktab.banking.model;

import ir.maktab.banking.model.accounts.*;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Branch branch;
    private List<Account> accountList = new ArrayList<>();

    public Customer(String name, Account account) {
        this.name = name;
        setAccountList(account);
    }

    public Customer(String name, Account account1, Account account2) {
        this.name = name;
        setAccountList(account1);
        setAccountList(account2);
    }

    public Customer(String name, Account account1, Account account2, Account account3) {
        this.name = name;
        setAccountList(account1);
        setAccountList(account2);
        setAccountList(account3);
    }

    public Customer(String name, Account account1, Account account2, Account account3, Account account4) {
        this.name = name;
        setAccountList(account1);
        setAccountList(account2);
        setAccountList(account3);
        setAccountList(account4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountList(Account account) {
        this.accountList.add(account);
    }

    public Account getAccountFromAccountList(Account account) {
        account.getAccountNo();
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(account))
                return accountList.get(i);
        }
        return null;
    }

    public double calCustomerBalance() {
        //return account.getCreditCard().getCredit();
        return 0;
    }

}
