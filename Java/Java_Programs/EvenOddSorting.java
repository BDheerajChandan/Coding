//Write a program to initialize 10 numbers in an array. Separate and
//stroe all the odd and even numbers in two separate arrays.  Print
//both the arrays alongwith their sums.

class EvenOddSorting
{
public static void sorting()
{
int arr[ ] = {19,21,31,39,45,49,65,68,62,10};
int even[] = new int[10];
int odd[] = new int [10];
int i,j,k,m;
int sumeven=0;
int sumodd=0;
for (i=0,k=0,m=0; i<10; i++)
{
if(arr[i]%2 == 0)
{
even[k] = arr[i];
k++;
sumeven += arr[i];
}
else 
{
odd[m] = arr[i];
m++;
sumodd += arr[m];
}
}
System.out.print("Original Array=");
for(i=0;i<10;i++)
System.out.println(" " +arr[i]);
System.out.print("Array of Even Numbers=");
for(i=0; i<k;i++)
System.out.print(" " +even[i]);
System.out.print("\n");
System.out.println("Sum of Even Numbers=" +sumeven);
System.out.print("Array of Odd Numbers=");
for(i=0; i<m;i++)
System.out.print(" " +odd[i]);
System.out.print("\n");
System.out.print("Sum of Odd Numbers=" +sumodd);
}
}
