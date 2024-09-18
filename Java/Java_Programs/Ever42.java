//Program to findthe sum of Array Elements.
import java.io.*;
public class Ever42
{
public void main() throws Exception
{
int i;
int sum=0;
int[] ar = new int[50];
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input =new BufferedReader(reader);
System.out.print ("Enter the number in Array = ");
String n = input.readLine();
String number;
int a = Integer.parseInt(n);
for(i=0; i<a; i++)
{
System.out.print("Enter Number :: " +(i+1)+" = ");
number = input.readLine();
ar[i] = Integer.parseInt(number);
}
for(i=0; i<a; i++)
sum=sum+ar[i];
System.out.println("Sum of Array Elements = " +sum);
}
}

















