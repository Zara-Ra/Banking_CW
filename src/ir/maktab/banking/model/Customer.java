package ir.maktab.banking.model;

import ir.maktab.banking.model.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Branch branch;
    private List<Account> accountList = new ArrayList<>();

    public Customer(String name, Account... account){
        this.name = name;
        for(Account ac : account){
            setAccountList(ac);
        }
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

        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(account))
                return accountList.get(i);
        }
        return null;
    }

    public double calCustomerBalance(Account account) {

        return getAccountFromAccountList(account).getCreditCard().getCredit();

    }

    public void setCustomerBalance(Account account, double amount) {

         getAccountFromAccountList(account).getCreditCard().setCredit(amount);

    }
}
