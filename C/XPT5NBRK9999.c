#include<stdio.h>
#include<math.h>
void main()
{
	int n,c=0;	
	float F;
	for(int i=1;i<=5;i++)
	{
		printf("enter the numbers");
		scanf("%d",&n);
		if(n>=0)
		{
			F=Sqrt(n);
		printf("SQUARE ROOT OF ANUMBER IS %f",F);
		}
		if(n<0)
		{
			c++;
			printf("negative number entered");
		}
		if(n==9999)
		{
			break;
		}
	}	
	printf("number of negative numbers entered %d",c);
}

