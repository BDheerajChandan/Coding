class Automorphic
{
public void main(int num)
{
int s,i,j,m,n,f;
i=j=f=0;
int [] a = new int[10];
int [] b = new int[5];
System.out.println("Number Entered=" +num);
s=num*num;
while (num!=0)
{
b[i] = num%10;
num /=10;
++i;
}
while(s !=0)
a[i] = s%10;
s /=10;
++j;

for (n=0;n<i;  n++)
{
m=0;
if(a[m] != b[n])
s=1;
if(s==0)
System.out.println("Number is Automorphic");
else
System.out.println("Number is not Automorphic");
}
}
}
