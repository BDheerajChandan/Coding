#include<stdio.h>
int main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
		       	  if((j==2)&&((i%2)==0)) 
				{
					printf("    * ");
				}else{
					printf(" * ");
				}		
		}
		printf("\n");
	}
	return 0;
}
