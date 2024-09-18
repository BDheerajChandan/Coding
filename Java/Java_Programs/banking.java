//public class for declaring a package.

 
                    //class bank, its constructor  is public.
                   // method showdata() is also public.
class banking          
{
String name;
double balance;
bank(String n, double a)
{
name = n;
balance = a;
}
void showdata()
{
if (balance > 0)
{
System.out.println("Name = " +name);
System.out.println("Balance = " +balance);
}
}
}
class balances
{
public void main()  
{
                                        //bank class is public 
                                        //use bank class and 
                                        //call its constructor

bank current= new current("A", 1000.00);
current.showdata();
}
}