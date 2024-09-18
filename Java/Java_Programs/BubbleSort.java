//Bubble Sort
class BubbleSort
{
private int a[] = new int[8];
public void inputdata(int array[])
{
for(int i=0;i<a.length;i++)
a[i]=array[i];
}
public void sorting()
{
int i=0,j=0;
int temp=0;
System.out.println("Array Elements are = ");
for(i=0;i<a.length;i++)
{
System.out.println(a[i] + " ");
}
                            // Now Sorting Elements 
                            // through Bubble Sort    
for(int k=0;k<a.length;k++)
{
for(j=0;j<a.length-1;j++)
{
if(a[j]>a[j+1])
{
temp = a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}  
System.out.println("The sorted array is ");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+ " ");
}
}
}
