//This program finds the sum of series 2^3 +3^3 +4^3 +.....N^3
import java.io.*;
import java.lang.*;
class Withbluej
{
public void withblue(int x, int n)
{
x =2;
double c;
c=0;
for(int i =0; i<n; i++)
{
c = c+ Math.pow(x,3);
x++;
}
System.out.print("Sum of Series is  =" +c);
}
}