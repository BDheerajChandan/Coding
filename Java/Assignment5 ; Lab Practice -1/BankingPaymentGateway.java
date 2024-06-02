interface PaymentGateway 
{
    void processPayment(double amount);
}
// Bank.java
abstract class Bank implements PaymentGateway 
{
    protected String name;
    protected String accountNumber;
    public Bank(String name, String accountNumber) 
    {
        this.name = name;
        this.accountNumber = accountNumber;
    }
    @Override
    public abstract void processPayment(double amount);
    public void displayInfo() 
    {
        System.out.println("Bank Name: " + name + ", Account Number: " + accountNumber);
    }
}
// SBI.java
class SBI extends Bank 
{
    public SBI(String name, String accountNumber) 
    {
        super(name, accountNumber);
    }
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing payment of Rs. " + amount + " through SBI.");
    }
}
// HDFC.java
class HDFC extends Bank 
{
    public HDFC(String name, String accountNumber) 
    {
        super(name, accountNumber);
    }
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing payment of Rs. " + amount + " through HDFC.");
    }
}
// BankingPaymentGateway.java
public class BankingPaymentGateway 
{
    public static void main(String[] args) 
    {
        Bank sbi = new SBI("State Bank of India", "SBI123456");
        Bank hdfc = new HDFC("HDFC Bank", "HDFC654321");
        sbi.displayInfo();
        sbi.processPayment(10000.50);
        hdfc.displayInfo();
        hdfc.processPayment(5000.75);
    }
}