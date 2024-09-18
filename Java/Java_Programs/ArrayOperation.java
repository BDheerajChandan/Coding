//Sum of arrays elements. subtraction of array1 from array2

class ArrayOperation
{
public int ar1[][] = new int[3][3];
public int ar2[][] = new int[3][3];
public int ar3[][] = new int[3][3];

public void data(int array1[][],int array2[][])
{ 
 int i=0,j=0;
int c=0;

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
ar1[i][j]=array1[i][j];
}
    }
    
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
ar2[i][j]=array2[i][j];
}
    }
{
System.out.println("Array-1 Elements are = ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(ar1[i][j] + " ");
}
    }
System.out.println("Array-2 Elements are = ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(ar2[i][j] + " ");
}
    }
System.out.print("After Sum Array Elements are=");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
ar3[i][j]=ar1[i][j]+ar2[i][j];
System.out.print(ar3[i][j] + " ");
}
    }
System.out.print("Subtraction of arrays(array2-arra1)=");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{

System.out.print(ar2[i][j]-ar1[i][j]+ " ");
    }
}
}
}
} 


