// Account.java
abstract class Account 
{
    String accountNumber;
    double balance;
    public Account(String accountNumber, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public abstract boolean withdraw(double amount);
    public abstract double calculateInterest();
    public void display() 
    {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
// SavingsAccount.java
class SavingsAccount extends Account 
{
    double interestRate;
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) 
    {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
            return false;
        }
    }
    public double calculateInterest() 
    {
        return balance * interestRate / 100;
    }
    public void display() 
    {
        super.display();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
    }
}
// CheckingAccount.java
class CheckingAccount extends Account {
    double overdraftLimit;
    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) 
    {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount) 
    {
        if (amount > 0 && (balance + overdraftLimit) >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit");
            return false;
        }
    }
    public double calculateInterest() 
    {
        // Checking accounts typically do not earn interest
        return 0;
    }
    public void display() 
    {
        super.display();
        System.out.println("Account Type: Checking, Overdraft Limit: " + overdraftLimit);
    }
}
// Main.java
public class AccountsMain 
{
    public static void main(String[] args) 
    {
        Account savingsAccount = new SavingsAccount("SA123", 1000, 3.5);
        Account checkingAccount = new CheckingAccount("CA456", 500, 200);

        System.out.println("Initial Account Details:");
        savingsAccount.display();
        checkingAccount.display();

        System.out.println("\nPerforming Transactions:");
        savingsAccount.deposit(200);
        savingsAccount.withdraw(150);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(600);

        System.out.println("\nCalculating Interest:");
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Checking Account Interest: " + checkingAccount.calculateInterest());

        System.out.println("\nUpdated Account Details:");
        savingsAccount.display();
        checkingAccount.display();
    }
}