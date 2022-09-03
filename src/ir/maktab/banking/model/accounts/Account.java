package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.service.AccountService;

public abstract class Account {
    private String accountNo;
    private CreditCard creditCard;
    private AccountService accountService;

    public Account(String accountNo, CreditCard creditCard) {
        this.accountNo = accountNo;
        this.creditCard = creditCard;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public double withdraw(Customer customer, double amount) {
        if (accountService != null)
            return accountService.withdraw(customer, this, amount);
        return -2;
    }

    public double deposit(Customer customer, double amount) {
        if (accountService != null)
            return accountService.deposite(customer, this, amount);
        return -2;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

}
