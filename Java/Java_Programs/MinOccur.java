//Write a program which accepts the number from a keyboard and
//prints the digit which occurs minimum number of times and also
//prints its frequency.
class MinOccur
{
public void Min(int n)
{
int number[]=new int[10];
int digit;
int s=0;
int min,f,i;
min=i=0;
f=9;
System.out.print("The Number is=" +n);
System.out.print("\n");
while(n>0)
{
digit=n%10;
s=s+digit;
n=n/10;
number[i]=digit;
i=i+1;
}
int count=0;
for (int j=0;j<=9;j++)
{
for(int k=0;k<i;k++)
{
if(number[k] == j)
count++;
}
if(count<f)
{
min=number[j];
f=count+1;
}
}
System.out.print("The digit exists minimum is ="+min);
System.out.print("\n");
System.out.print("It occurs " +f + " times");
}
}
