package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

public class ShortTermAccount extends Account {
    private double profit;

    //private Date date;
    private int yearNumber;

    public ShortTermAccount(String accountNo, CreditCard creditCard) {
        super(accountNo, creditCard);
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }
}
