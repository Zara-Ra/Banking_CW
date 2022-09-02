package ir.maktab.banking.model;

public class CreditCard {
    private String cardNumber;
    private double credit;

    public CreditCard(String cardNumber, double credit) {
        setCardNumber(cardNumber);
        this.credit = credit;
    }

    public CreditCard(String cardNumber) {
        setCardNumber(cardNumber);
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() == 16)
            this.cardNumber = cardNumber;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "\n'Credit Card Information' Card Number: " + cardNumber + " Current Credit Balance: " + credit;
    }
}
