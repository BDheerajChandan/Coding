#include<stdio.h>
int main()
{
	int n,i,k;
	printf("enter the number ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{	
		int c=0;
		for(int j=1;j<=i;j++)
		{
			if((i%j)==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			printf("%d\n",i);
		}
	}
	return 0;
}
