class ExchangeSelectionSort
{
public void sorting()
{
int arr[ ] = {19,21,31,29,45,49,65,68,61,10};
int n=10;
int i=0;
int temp,loc,small;
temp=loc=small=0;
System.out.print("Array List is =");
for(i=0;i<n;i++)
{
System.out.print(" " +arr[i]);
}
                           //Sorting Starts here
for(i=0;i<n;i++)
{
small=arr[i];
loc=i;
for(int j=i+1;j<n;j++)
{
if(arr[j]<small)
{
small=arr[j];
loc=j;
    }
}
temp=arr[i];
arr[i]=arr[loc];
arr[loc]=temp;
     }    
System.out.print("Exchange Sorted Array is=");
for(i=0;i<10;i++)

System.out.print(arr[i]+ " ");
    }
}
