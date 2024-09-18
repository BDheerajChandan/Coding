//Program to findthe sum of Array Elements.
import java.io.*;
public class test1
{
public void main(int n, int[] ar) 
{
int i;
int a;
int number=0;
int sum=0;
ar = new int[50];
System.out.print ("Enter the number in Array = ");
a = ar[n];
for(i=0; i<a; i++)
{
System.out.print("Enter Number :: " +(i+1)+" = ");
ar[i] = ar[number];
}
for(i=0; i<a; i++)
sum=sum+ar[i];
System.out.println("Sum of Array Elements = " +sum);
}
}

















