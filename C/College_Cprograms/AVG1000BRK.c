#include<stdio.h>
int main()
{
	int n,total=0;
	float avg;
	printf("enter the numbers");	
	for(int i=1;i<=1000;i++)
	{
		scanf("%d",&n);
		if(n>=0)
		{
			total=total+n;
		}else{
			break;
		}
	}
	avg=total/1000;
	printf("total average is %f",avg);
}
