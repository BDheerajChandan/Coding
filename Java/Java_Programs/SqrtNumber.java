import java.io.*;
import java.lang.*;
class SqrtNumber
{
public static void main(String args[]) throws IOException
{
double x,y;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.print("Enter Value of x =");
String v1=input.readLine();
x = Double.parseDouble(v1);
y = Math.sqrt(x);
System.out.print("Square Root =" +y);
}
}