//This program finds the sum of series 2^3 +3^3 +4^3 +.....N^3
import java.io.*;
import java.lang.*;
class SumSeries
{
public static void main(String args[]) throws IOException
{
int x =2;
int n;
double c;
c=0;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.print("Enter Value of n =");

String v1=input.readLine();
n = Integer.parseInt(v1);
for(int i =0; i<n; i++)
{
c = c+ Math.pow(x,3);
x++;
}
System.out.print("Sum of Series is  =" +c);

}
}