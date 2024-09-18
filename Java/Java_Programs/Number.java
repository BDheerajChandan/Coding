//Converting a decimal number into binary.
import java.io.*;
class Number
{
public void main(int n) 
{
int [] m = new int [10];;
int j;
System.out.println("Decimal  Number = " +n);
System.out.println("Binary Value of that decimal Number = ");
{
for (j=8; j>=1; j--)
{
m[j]=n%2;
n=n/2;
}
for (j=1; j<=8; j++)
System.out.print( +m[j] + "  ");
}
}
}
