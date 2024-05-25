#include<stdio.h>
int main()
{
	int n,sum=0,t,num;
	printf("enter the number");
	scanf("%d",&n);
	num=n;
	while(n!=0)
	{
		t=n%10;
		sum=sum+t;
		n=n/10;
	}
	printf("sumof the digits of a given number %d is = %d",num,sum);
}
