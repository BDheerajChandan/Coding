
//To find the Greatest Common Divisor of two numbers
import java.lang.*;
import java.io.*;
class Swap
{
public void main(int x, int y)
{
if(x>y)
{
x=x-y;
x=x+y;
x=y-x;
}
if (y>x)
{
y=y-x;
x=x+y;
y=x-y;
}

System.out.println("Number After Swapping x is = " +x);
System.out.println("Number After Swapping y is = " +y);
}
}