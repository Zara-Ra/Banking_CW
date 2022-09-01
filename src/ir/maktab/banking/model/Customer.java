package ir.maktab.banking.model;

import ir.maktab.banking.model.accounts.*;

public class Customer {
    private String name;
    private LongTermAccount longTermAccount;
    private ShortTermAccount shortTermAccount;
    private NoProfitAccount noProfitAccount;
    private CurrentAccount currentAccount;

    public Customer(String name, CurrentAccount currentAccount) {
        this.name = name;
        this.currentAccount = currentAccount;
    }

    public Customer(String name, LongTermAccount longTermAccount) {
        this.name = name;
        this.longTermAccount = longTermAccount;
    }

    public Customer(String name, ShortTermAccount shortTermAccount) {
        this.name = name;
        this.shortTermAccount = shortTermAccount;
    }

    public Customer(String name, NoProfitAccount noProfitAccount) {
        this.name = name;
        this.noProfitAccount = noProfitAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LongTermAccount getLongTermAccount() {
        return longTermAccount;
    }

    public void setLongTermAccount(LongTermAccount longTermAccount) {
        this.longTermAccount = longTermAccount;
    }

    public ShortTermAccount getShortTermAccount() {
        return shortTermAccount;
    }

    public void setShortTermAccount(ShortTermAccount shortTermAccount) {
        this.shortTermAccount = shortTermAccount;
    }

    public NoProfitAccount getNoProfitAccount() {
        return noProfitAccount;
    }

    public void setNoProfitAccount(NoProfitAccount noProfitAccount) {
        this.noProfitAccount = noProfitAccount;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public double calCustomerBalance() {
        //return account.getCreditCard().getCredit();
        return 0;
    }

}
