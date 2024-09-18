import java.lang.*;
import java.util.*;
class Ever65
{
public void main()
{
int ar[] = new int[15];
for (int i = 0; i<15; i++)
ar[i]=1*i;
//displaying the contents of the array.

System.out.println("Arrays Elements are :");
display(ar);

//sorting the original elements of the array.
Arrays.sort(ar);
System.out.println("Sorted Elements are :");
//displaying the sorted elements of the orginal array.
display(ar);

//filling elements in the array.
Arrays.fill(ar, 2, 7, 8 );
System.out.println("Now All the Arrays Elements are :");
display(ar);

//sorting the array elements after the fill.
Arrays.sort(ar);
System.out.println("Now After Fill, Sorted Elements are :");
display(ar);
//binary search for the specified element.
System.out.println("The Value 7 is at location :");
int index = Arrays.binarySearch(ar, 7);
System.out.println(index);
}

static void display(int ar[])
{
for (int i = 0; i<ar.length; i++)
System.out.print(ar[i] + " ");
System.out.println( " ");
}
}



