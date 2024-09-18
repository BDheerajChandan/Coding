class Bubble
{
public void sorting()
{
int arr[ ] = {19,21,39,31,45,65,49,68,62,10};
int n=10;
int i=0;
int k,temp;
k=temp=0;
System.out.print("Array List is =");
for(i=0;i<n;i++)
{
System.out.print(" " +arr[i]);
}
for(k=0;k<n;k++)
{
for(int j=0;j<n-1;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
    }
}
    }
System.out.print("\n");    
System.out.print("Bubble Sorted Array is=");
for(i=0;i<10;i++)
{
System.out.print(arr[i]+ " ");
    }
}
    }