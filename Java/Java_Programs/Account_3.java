/* * 1) Banking Management System *     
 *      a) create Account interface that defines basic operations(abstract method) like deposit, withdraw, and getBalance. *      
 *      b) create a BankAccount is a base class implementing the Account interface, representing a generic bank account. *      
 *      c) SavingsAccount and CurrentAccount are subclasses of BankAccount representing specific types of accounts. *          
 *          override methods like deposit and withdraw in SavingsAccount and CurrentAccount to provide specific behavior f for those account types. *      
 *      d) Demonstrate the usage of these classes in the BankSystem class(class with main method) by creating object of SavingsAccount and  *         
 *          CurrentAccount and access the functionaliy of  deposit and withdrawal getBalance. 
 * */
import java.io.*;
import java.util.*;
interface Account_3
{    
    public void deposit();    
    public void withdraw();    
    public void getBalance();
}
class BankAccount_3 implements Account_3
{
    String name;
    int acc_num;
    BankAccount_3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter b ");
    }
    public void deposit()
    {
    }
    public void withdraw()   
    {
    }
    public void getBalance()
    {
    }
}
class SavingsAccount_2 extends BankAccount_3
{
    public void deposit()
    {
    }
    public void getBalance()
    {
    }
}
class CurrentAccount_2 extends BankAccount_3
{
    public void withdraw()   
    {
    }
    public void getBalance()
    {
    }
}