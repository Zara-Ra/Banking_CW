import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.*;
import ir.maktab.banking.service.*;

public class Main {
    private static Customer customer;
    private static AccountService accountService;
    //private static CurrentAccountService currentAccountService = new CurrentAccountService();
    //...

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("6362141092542787", 100);
        CurrentAccount currentAccount = new CurrentAccount("100002111092876000001113", creditCard, "check1");
        LongTermAccount longTermAccount = new LongTermAccount("100002111092876000002243", creditCard, 0.14, 5);

        customer = new Customer("Zahra Rahimi", currentAccount, longTermAccount);

        Account ac = customer.getAccountFromAccountList(currentAccount);

        castAccountService(ac);
        //withdraw(ac);
        deposit(ac);
    }

    public static void deposit(Account account) {
        double amount = accountService.deposite(customer, account, 50);
        customer.setCustomerBalance(account, amount);
        System.out.println(customer.calCustomerBalance(account));
    }

    public static void withdraw(Account ac) {
        if (accountService != null) {
            System.out.println("withdraw from account number " + ac.getAccountNo());
            double credit = accountService.withdraw(customer, ac, 100);
            if (credit != -1) {
                System.out.println(" your current credit is: " + credit);
                customer.setCustomerBalance(ac, credit);
            }
            else
                System.out.println("withdraw failed credit is not enough!");
        } else
            System.out.println("withdraw failed");
    }

    public static void castAccountService(Account ac) {
        if (ac instanceof CurrentAccount)
            accountService = new CurrentAccountService();
        else if (ac instanceof LongTermAccount)
            accountService = new LongAccountService();
        else if (ac instanceof ShortTermAccount)
            accountService = new ShortAccountService();
        else if (ac instanceof NoProfitAccount)
            accountService = new NoProfitAccountService();
        else
            accountService = null;

    }

}
