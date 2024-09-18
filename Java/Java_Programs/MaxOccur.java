//Write a program which accepts the number from a keyboard and
//prints the digit which occurs maximum number of times and also
//prints its frequency.

class MaxOccur
{
public void Max(int n)
{
int number[]=new int[10];
int digit;
int s=0;
int most,f,i;
most=f=i=0;
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
if(count>f)
{
most=number[j];
f=count;
}

count=0;
}
System.out.print("The digit exists maximum is ="+most);
System.out.print("\n");
System.out.print("It occurs" +f + " times");
}
}
