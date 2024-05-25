#include<stdio.h>
int main()
{
	int n,num=0,i;
	printf("enter a number ");
	scanf("%d",&n);
	for(i=1;i<n;i++)
	{
		if((n%i)==0)
		{
			printf("%d",i);
			num=num+i;
		}
	}
	if(num==n)
	{
		printf(" perfect number =%d",n);
	}else{
		printf(" %d is not a perfect number ",n);

	}
}
