import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.CurrentAccount;
import ir.maktab.banking.model.accounts.LongTermAccount;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("6362141092542787", 10000000);
        Date date = new Date();//2022-10-10
        CurrentAccount currentAccount = new CurrentAccount("100002111092876000001113", creditCard,"");
        Customer customer = new Customer("Zahra Rahimi", currentAccount);

    }
}
