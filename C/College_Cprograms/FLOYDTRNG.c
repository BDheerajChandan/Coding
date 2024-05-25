#include<stdio.h>
int main()
{
	int m=1;
	for(int i=1;i<=13;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(m!=92)
			{
				printf("%d   ",m);
				m++;
			}
		}
		printf("\n");
	}
	return 0;
}
