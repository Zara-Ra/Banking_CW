package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

import java.util.Date;

public class ShortAccount extends Account{
    private  double profit;
    private Date date;
    public ShortAccount(String accountNo, CreditCard creditCard) {
        super(accountNo, creditCard);
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
