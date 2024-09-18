//Method Return Values
import java.io.*;
class ArraySorting
{
void sort(int arr[], int n)
{
int i, j;
i = 0;
j=0;
int temp;
while (i<(n-1))
{
j=i+1;
while(j<n)
{
if (arr[i]>arr[j])
{
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;    

}
j++;                                        
}
i++;
}
}
}
class Sort
{
public void sort() 
{
ArraySorting array = new ArraySorting();
int i, j, temp;
int value[] = {32,12,7,6,19,11};    //initialising values of array elements
int ln = value.length;
System.out.println("Numbers Before Sorting =" );
for (i=0; i<ln; i++)

System.out.println(value [i] +"  ");
System.out.println();
System.out.println("Numbers After Sorting =" );
                                    //Returning the values
array.sort(value, ln);

for(i=0; i<ln; i++)
{
System.out.print(value [i] +"  ");
}
}
}



















