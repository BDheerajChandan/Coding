#include<stdio.h>
#include<math.h>
void main()
{
	int n,c=0;
	float F;
	for(int i=1;i<=5;i++)
	{
		printf("enter the range ");
		scanf("%d",&n);
		if((n>=0)&&(n!=9999))
		{	
		F=sqrt(n);		
		printf("square of a number is = %f",F);
		}
		if(n<0)
		{
		c++;
		printf("negative number is entered");
		}
		if(n==9999)
		{
			break;
		}else{
			continue;
		}
	}
	printf("number of negative number entered=%d",c);
}
