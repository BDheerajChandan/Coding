//Write a program to store 10 numbers in an array.Create another array to contain square root  values of all the 
//elements of the first array.

class SqrtArray
{
private double ar[] = new double[10];
public void data(int array[])
{
for(int i=0;i<ar.length;i++)
ar[i]=array[i];
}
public void squareroot()
{
int i=0;
System.out.println("Array Elements are = ");
for(i=0;i<ar.length;i++)
{
System.out.println(ar[i] + " ");
}
double x[]=new double[10];
System.out.println("The square 4oot values of new array is ");
for(i=0;i<ar.length;i++)
{
x[i]=Math.sqrt(ar[i]);
System.out.print(x[i]+ " ");
}
}
} 


