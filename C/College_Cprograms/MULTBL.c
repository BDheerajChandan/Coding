#include<stdio.h>
int main()
{
	int n;
	for(int i=1;i<=12;i++)
	{	
		printf("%d   ",i);
		for(int j=1;j<=10;j++)
		{	
			n=i*j;
			printf("%d  ",n);
		}
		printf("\n");
	}
	return 0;
}
			
