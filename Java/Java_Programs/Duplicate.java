class Duplicate
{
public void duplicate(int arr[])
{
int i,j,k,n=10,result;
result=0;

System.out.print("You have entered=" +arr.length +" elements");
System.out.print("Elements are =" );
for(i=0;i<n;i++)
{
System.out.print(arr[i] + "\t");
for(i=0;i<arr.length-1;i++)
{
for(j=0;j<arr.length;i++)
{
if(arr[i]==arr[j+1])
{
n=n-1;
for(k=j;k<arr.length-1;k++)
{
arr[k]=arr[k+1];

result=1;
j=j-1;
        }
    }
    
}
if(result ==0)
System.out.print("Array does not have duplicate element.");
else
{
System.out.print("Now  Elements of the array are=");
for(i=0;i<n;i++)
{
System.out.print(arr[i] + "\t");
    }
}
    }
}
    }
}