#include<stdio.h>
int main()
{
	int n,j;
	printf("enter the number");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d ",j);
		if(i==j)
		{
			for(int k=(i-1);k>=1;k--)
			{
				printf("%d ",k);
			}
		}
		}
		printf("\n");
	}
	return 0;
}
