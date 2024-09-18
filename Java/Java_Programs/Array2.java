class array2
{
protected int M[] = new int [25];
public void input(int num[])
{
for(int i=0; i<25; i++)
M[i] = num[i];
}
public void linearsort()
{
int x,i,j,n,k,temp;
x=j=n=temp=0;
System.out.println("Array Elements are=");
for(i=0; i<n; i++)
{
System.out.println(M[i]);
}
for(k=0; k<n; k++)
{
temp=M[k];
j=k-1;
while(temp<M[j])
{
M[j+1] = M[j];
j=j-1;
if(j<0)
break;
}
M[j+1] = temp;
}
System.out.println("Sorted Array=");
for(i=0; i<n; i++)
{
Ssytem.out.println(M[j] +" ");
}
}
}