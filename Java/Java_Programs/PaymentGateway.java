/*3) PaymentGatewaySystem
    a) PaymentGateway is an interface defining a method processPayment to process payments.
    b) Bank is an abstract class representing a generic bank, implementing the PaymentGateway interface and providing common functionalities 
        like name and account number.
    c) SBI and HDFC is a concrete class representing a specific bank, extending the Bank class. It implements the processPayment method and 
        provide the specific functionality to the respective bank(SBI,HDFC)
    D) The main method in the BankingPaymentGateway class demonstrates how to use the banking payment gateway by creating an instance of 
        SBI ,HDFC and processing a payment.
 */
interface PaymentGateway
{
    public void processPayment();
}
class Bank implements PaymentGateway
{
    String name; 
    int acc_num;
    public void processPayment()
    {
        System.out.println("Payment process");
    }
}
class SBI extends Bank
{
    String name; 
    int acc_num;
    public void processPayment()
    {
    }
}
class HDFC extends Bank
{
    String name; 
    int acc_num;
    public void processPayment()
    {
    }
}
class BankingPaymentGateway
{
    SBI s=new SBI();
    HDFC h=new HDFC();
}