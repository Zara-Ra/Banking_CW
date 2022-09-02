package ir.maktab.banking.model.accounts;

import ir.maktab.banking.model.CreditCard;

import java.sql.Date;

public class LongTermAccount extends Account{
    private double annualProfit;
    //private Date yearNumber;
    private int yearNumber;
    public LongTermAccount(String accountNo, CreditCard creditCard, double annualProfit, int yearNumber) {
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

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }
}
