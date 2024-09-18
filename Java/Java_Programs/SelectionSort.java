class SelectionSort
{
public void sorting()
{
int arr[ ] = {19,21,31,49,65,29,45,68,61,10};
int n=10;
int i=0;
int k,temp;
k=temp=0;
System.out.print("Total Number of Elements in the Array =" +arr.length);
System.out.print("Array List is =");
for(i=0;i<n;i++)
{
System.out.print(" " +arr[i]);
}
                           //Selection Sorting Starts here
for(k=0;k<n-1;k++)
{
for(int j=k+1;j<n;j++)
{
if(arr[k]>arr[j])
{
temp=arr[k];
arr[k]=arr[j];
arr[j]=temp;
    }
}
    }
System.out.print("\n");    
System.out.print("Selection Sorted Array is=");
for(i=0;i<10;i++)
{
System.out.print(arr[i]+ " ");
    }
}
    }