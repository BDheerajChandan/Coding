

//Program to perform Binary Search in an array of numbers:

class fillarray 
{
protected int M[] = new int[10];
public void fill(int s)// argument s to be the element to be searched
  {
int x=0,i=0,n=10,middle=0,pos=0,first=0;
for(i=0;i<n;i++)
{
M[i]=i+1;
}
    // Display of array
for(i=0;i<n;i++)
{
System.out.println(M[i]);
}
int last = n-1;
pos=-1;
while((pos==-1)&&(first<=last))
{
// Application of binary search
middle=(first+last)/2;
if (M[middle]==s)
{
pos=middle;
}
if(M[middle]<s)
first=middle+1;
else
last=middle-1;
}
if (pos==-1)
System.out.println("Sorry not present in the list");
else
System.out.println("The element lies in the array at position"+(pos+1));
}
}