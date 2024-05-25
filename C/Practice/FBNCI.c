#include<stdio.h>
int main()
{
int a1=0,a2=0,a3=0;
int b=1;
printf("%d,%d,%d,%d",a1,a2,a3,b);
int sum;
for(int i=4;i<13;i++)
{
sum=a1+a2+a3+b;
printf(",%d",sum);
a1=a2;
a2=a3;
a3=b;
b=sum;
}
return 0;
}

