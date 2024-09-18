//To find the Greatest Common Divisor of two numbers
import java.lang.*;
import java.io.*;
class Divisor
{
public  void main(int x, int y)
{
int r,r1;
r=0;
r1=0;
System.out.println("First Number = " +x);
System.out.println("Second Number = " +y);
while (r==0)
{

r=x%y;
x=r;
y=x;

}
System.out.println("Greatest Common Divisor =" +r);
}
}











