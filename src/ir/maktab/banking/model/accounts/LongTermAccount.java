package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

import java.util.Date;

public class LongTermAccount extends Account{
    private double annualProfit;
    private Date yearNumber;

    public LongTermAccount(String accountNo, CreditCard creditCard, double annualProfit, Date yearNumber) {
        super(accountNo, creditCard);
        this.annualProfit=annualProfit;
        this.yearNumber=yearNumber;
    }

    public double getAnnualProfit() {
        return annualProfit;
    }

    public void setAnnualProfit(double annualProfit) {
        this.annualProfit = annualProfit;
    }

    public Date getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(Date yearNumber) {
        this.yearNumber = yearNumber;
    }
}
