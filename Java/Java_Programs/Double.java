//D0ubles the array elements of 4x4 array
class Double
{
private int ar[][] = new int[4][4];
public int i=0,j=0;
public void data(int array[][])
{
for(i=0;i<ar.length;i++)
{
for(j=0;j<ar.length;j++)
{
ar[i][j]=array[i][j];
}
}
System.out.println("Array Elements are = ");
for(i=0;i<ar.length;i++)
{
for(j=0;j<ar.length;j++)
{
System.out.println(ar[i][j] + " ");
}
    }
int x[][]=new int[4][4];
System.out.println("The doubled array is ");
for(i=0;i<ar.length;i++)
{
for(j=0;j<ar.length;j++)
{
x[i][j]=ar[i][j]*2;
System.out.print(x[i][j]+ " ");
}
}
} 
}

