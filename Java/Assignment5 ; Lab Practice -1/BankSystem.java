interface Account 
{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
abstract class BankAccount implements Account 
{
    protected double balance;
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    @Override
    public double getBalance() 
    {
        return balance;
    }
}
class SavingsAccount extends BankAccount 
{
    private static final double INTEREST_RATE = 0.03;
    public SavingsAccount(double initialBalance)
    {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount + (amount * INTEREST_RATE);
        }
    }
    @Override
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
        }
    }
}
class CurrentAccount extends BankAccount 
{
    static final double OVERDRAFT_LIMIT = 1000.0;
    public CurrentAccount(double initialBalance) 
    {
        super(initialBalance);
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) 
        {
            balance -= amount;
        }
    }
}
public class BankSystem 
{
    public static void main(String[] args) 
    {
        // Create SavingsAccount and CurrentAccount objects
        SavingsAccount savings = new SavingsAccount(1000.0);
        CurrentAccount current = new CurrentAccount(500.0);

        // Deposit and Withdraw in SavingsAccount
        System.out.println("Savings Account:");
        savings.deposit(500);
        System.out.println("Balance after deposit: " + savings.getBalance());
        savings.withdraw(200);
        System.out.println("Balance after withdrawal: " + savings.getBalance());

        // Deposit and Withdraw in CurrentAccount
        System.out.println("Current Account:");
        current.deposit(300);
        System.out.println("Balance after deposit: " + current.getBalance());
        current.withdraw(700);
        System.out.println("Balance after withdrawal: " + current.getBalance());
    }
}
