import java.io.*;
import java.lang.*;
class ifelseiftest
{
public static void main(String args[]) throws IOException
{
double sales;
double comm;
comm = 0;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.print("Enter Value of Sales = ");
String v1= input.readLine();
sales = Double.parseDouble(v1);

if (sales>100000)
{
comm = sales*(0.25);
System.out.print("Commission =" +comm);
}
else
if (sales >=80000)
{
comm = sales*(0.225);
System.out.print("Commission =" +comm);
}
else if(sales>=60000)
{
comm = sales*(0.20);
System.out.print("Commission =" +comm);
}
else 
if (sales>=40000)
{
comm = sales*(0.15);
System.out.print("Commission =" +comm);
}
else
comm = sales*(0.125);
System.out.print("Commission = " +comm);
}
}



