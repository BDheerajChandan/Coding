import java.util.*;
public class InsufficientFundsException extends Exception 
{
    public double amount;
    public InsufficientFundsException(double amount) 
    {
        this.amount = amount;
    }
    public double getAmount() 
    {
        return amount;
    }
    @Override
    public String toString() 
    {
        return "InsufficientFundsException: Insufficient funds. You need additional " + amount + " dollars.";
    }
}
////////////////////////////////////

class CheckingAccount 
{
    private double balance;
    private String accountNumber;
    public CheckingAccount(String accountNumber, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException 
    {
        if (amount > balance) 
        {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(shortfall);
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " dollars successful. New balance: " + balance);
    }
}
//////////////////////////////////////

class Main
{
    public static void main(String[] args) 
    {
        CheckingAccount account = new CheckingAccount("123456789", 500.00);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the bank. Your account balance is: " + account.getBalance());    
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        try 
        {
            account.withdraw(amount);
        } 
        catch (InsufficientFundsException e) 
        {
            System.out.println(e);
        }
    }
}

