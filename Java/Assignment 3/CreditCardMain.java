// Define the CreditCard interface
interface CreditCard {
    void pay(double amount);
    void checkBalance();
}

// Define the abstract BankAccount class
abstract class BankAccount2 implements CreditCard {
    protected double balance;
    protected String currency;

    public BankAccount2(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: " + balance + " " + currency);
    }
}

// Define the RupeeAccount class
class RupeeAccount extends BankAccount2 {
    public RupeeAccount(double initialBalance) {
        super(initialBalance, "Rupees");
    }

    @Override
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Rupees account.");
        } else {
            balance -= amount;
            System.out.println("Paid " + amount + " Rupees. New balance: " + balance + " Rupees.");
        }
    }
}

// Define the DollarAccount class
class DollarAccount extends BankAccount2 {
    public DollarAccount(double initialBalance) {
        super(initialBalance, "Dollars");
    }

    @Override
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Dollars account.");
        } else {
            balance -= amount;
            System.out.println("Paid " + amount + " Dollars. New balance: " + balance + " Dollars.");
        }
    }
}

// Define the PoundAccount class
class PoundAccount extends BankAccount2 {
    public PoundAccount(double initialBalance) {
        super(initialBalance, "Pounds");
    }

    @Override
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Pounds account.");
        } else {
            balance -= amount;
            System.out.println("Paid " + amount + " Pounds. New balance: " + balance + " Pounds.");
        }
    }
}

// Main class to test the implementation
public class CreditCardMain {
    public static void main(String[] args) {
        BankAccount2 rupeeAccount = new RupeeAccount(1000);
        BankAccount2 dollarAccount = new DollarAccount(200);
        BankAccount2 poundAccount = new PoundAccount(300);

        rupeeAccount.checkBalance();
        dollarAccount.checkBalance();
        poundAccount.checkBalance();

        rupeeAccount.pay(150);
        dollarAccount.pay(50);
        poundAccount.pay(350);

        rupeeAccount.checkBalance();
        dollarAccount.checkBalance();
        poundAccount.checkBalance();
    }
}
