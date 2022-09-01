package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

public class CurrentAccount extends Account{
    private String checkbook;

    public CurrentAccount(String accountNo, CreditCard creditCard,String checkbook) {
        super(accountNo, creditCard);
        this.checkbook=checkbook;
    }

    public String getCheckbook() {
        return checkbook;
    }

    public void setCheckbook(String checkbook) {
        this.checkbook = checkbook;
    }
}
