//Using recursion
//Factorial of a given number
import java.io.*;
class factorial
{
void factorial(int n)
{
int i;
int f =1;
for (i=1;i<=n; i++)
f *=i;
System.out.println("Factorial of " +n + " is =" +f);
}
}
class calculation
{
public void main(int n) 
{
factorial nfactorial = new factorial();
                      //now passing value into method
nfactorial.factorial(n);
}
}






