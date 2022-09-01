package ir.maktab.banking.model;

public abstract class Account {
    private String accountNo;
    private CreditCard creditCard;

    public Account(String accountNo, CreditCard creditCard) {
        this.accountNo = accountNo;
        this.creditCard = creditCard;
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

    abstract boolean withdraw(double money);
    abstract boolean deposit(double money);
}
