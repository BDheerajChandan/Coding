class bank
{
String name;
double balance;
public void bank(String n, double a)
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
class bankbalance
{
public  static void main(String args[])
{
bank current [] = new bank [2];
current[0] = new bank ("A", 1000.00);
current[1] = new bank ("B", 2000.00);
for (int i = 0; i<2; i++)
current [i].showdata();
}
}
