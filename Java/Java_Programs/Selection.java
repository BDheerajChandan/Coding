//Insertion Sort
class Selection
{
private int a[] = new int[8];
public void inputdata(int array[])
{
for(int i=0;i<a.length;i++)
a[i]=array[i];
}
public void sorting()
{
int x=0,i=0,j=0;
int temp=0;
System.out.println("Array Elements are = ");
for(i=0;i<a.length;i++)
{
System.out.println(a[i] + " ");
}

for(int k=1;k<a.length; k++)
{
i=k;
for(j=k+1; j<a.length; j++)
{
if (a[i]>a[j])
i=j;
}
if(i! = temp)
{
temp=a[i];
a[k] = a[i];
a[i] = k;
}

System.out.println("Elements in Sorted Order are = ");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+ " ");
}
}   
}

            