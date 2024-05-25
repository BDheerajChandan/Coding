#include<stdio.h>
int main()
{
	int n,s=1;
	printf("enter the range");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		s=s*11;
		printf("%d \n",s);
	}
	printf("\n");
	return 0;
}
