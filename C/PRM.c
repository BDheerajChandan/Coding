#include<stdio.h>
int main()
{
	int c=0,n,i;
	printf("enter the number ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
			if((n%i)==0)
			{
				c++;
			}
	}
	if(c==2)
	{
		printf("prime number = %d",n);
	}else{
		printf("%d is not a prime number ",n);
	}
	return 0;
}
