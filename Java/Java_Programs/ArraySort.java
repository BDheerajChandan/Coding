//Sorting Array in Descending Order

class ArraySort
{
public void main()
{
int number [] = {15,8,12,32,52};
int n = number.length;
System.out.print("Enter Elements of the Array = ");
for (int i = 0; i<n; i++)
{
System.out.print( " " +number[i]);
}
System.out.print("\n");
for (int i = 0;  i<n; i++)
{
for (int j =i+1; j<n; j++)
{
if (number [i] <number [j])
{
int temp = number[i];
number[i] = number[j];
number [j] = temp;
}
}
}

System.out.print("Sorted Elements of the Array = ");
for (int i = 0; i<n; i++)
{
System.out.println(" " +number[i]);
}
System.out.println(" ");
}
}



