import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.Account;
import ir.maktab.banking.model.accounts.CurrentAccount;
import ir.maktab.banking.model.accounts.LongTermAccount;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("6362141092542787", 10000000);
        //Date date = Date.valueOf("2021-01-01");
        CurrentAccount currentAccount = new CurrentAccount("100002111092876000001113", creditCard,"");
        LongTermAccount longTermAccount = new LongTermAccount("100002111092876000002243",creditCard,0.14,5);
        Customer customer = new Customer("Zahra Rahimi", currentAccount,longTermAccount);
        //customer.getAccountFromAccountList(longTermAccount).
    }
}
