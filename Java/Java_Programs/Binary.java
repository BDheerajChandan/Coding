// Binary Search 
class Binary
{
private int a[] = new int[8];
public void inputdata(int array[])
{
for(int i=0;i<a.length;i++)
a[i]=array[i];
System.out.println("Array Elements are = ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i] + "  ");
}
}
public void fill(int element)//element to be searched
{
int x=0,i=0,mid=0,pos=0,first=0;
System.out.println("Element to be Searched =" +element);

for(i=0;i<a.length;i++)
{
a[i]=i+1;
}
int last = a.length-1;
pos=-1;
while((pos==-1)&&(first<=last))
break;
{
//Binary search starts
mid=(first+last)/2;
if (a[mid]==element)
{
pos=mid;
}
if(a[mid]<element)
first=mid+1;
else
last=mid-1;
}
if (pos==-1)
System.out.println("Element is not present in the list");
else
System.out.println("Element is at position no."+ (pos+1));
}
}