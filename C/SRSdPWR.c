#include<stdio.h>
void main()
{
	int n=1;
	float f,sum=0.0;
	printf("enter the range");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
	n=n*i*i;
	f=1/n;
	sum=sum+(1/f);
	}
	printf("%f \n",sum);
}
