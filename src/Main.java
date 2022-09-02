import ir.maktab.banking.model.CreditCard;
import ir.maktab.banking.model.Customer;
import ir.maktab.banking.model.accounts.*;
import ir.maktab.banking.service.*;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("6362141092542787", 10000000);
        //Date date = Date.valueOf("2021-01-01");

        CurrentAccount currentAccount = new CurrentAccount("100002111092876000001113", creditCard, "check1");
        LongTermAccount longTermAccount = new LongTermAccount("100002111092876000002243", creditCard, 0.14, 5);

        Customer customer = new Customer("Zahra Rahimi", currentAccount, longTermAccount);

        Account ac = customer.getAccountFromAccountList(currentAccount);
        withdraw(customer,ac);
        }
        public static void withdraw(Customer customer,Account ac){
            AccountService as;
            if (ac instanceof CurrentAccount)
                as = new CurrentAccountService();
            else if (ac instanceof LongTermAccount)
                as = new LongAccountService();
            else if (ac instanceof ShortTermAccount)
                as = new ShortAccountService();
            else if (ac instanceof NoProfitAccount)
                as = new NoProfitAccountService();
            else
                as = null;
            if (as != null && as.withdraw(customer, ac, 100))
                System.out.println("withdraw from account number "+ac.getAccountNo()+" was successfully done");

            else
                System.out.println("withdraw failed");
        }
        public static void deposit(Customer customer,Account account){}
}
