#include<stdio.h>
int main()
{
	int fact=1,n;
	printf("enter anumber \n");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("factrial of a number %d is %d ",n,fact);
	return 0;
}
