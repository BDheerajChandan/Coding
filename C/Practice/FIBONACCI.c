#include<stdio.h>
int main()
{
int a=0,b=1,c;
printf("0\n1\n");
for(int i=3;i<=10;i++)
{
	c=a+b;
	printf("%d\n",c);
	a=b;
	b=c;
}
return 0;
}
	
