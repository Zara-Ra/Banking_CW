package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

import java.util.Date;

public class ShortTermAccount extends Account{
    private  double profit;
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

    public int getDate() {
        return yearNumber;
    }

    public void setDate(int yearNumber) {
        this.yearNumber = yearNumber;
    }
}
